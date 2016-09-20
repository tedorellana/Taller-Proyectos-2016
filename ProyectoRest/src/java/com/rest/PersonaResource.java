/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest;

import com.google.gson.Gson;
import com.helper.PersonaHelper;
import com.pojos.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author TED
 */
@Path("rest")
public class PersonaResource {

    private PersonaHelper personahelper;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public PersonaResource() {
        personahelper = new PersonaHelper();
    }

    /**
     * Retrieves representation of an instance of com.rest.GenericResource
     * @return an instance of java.lang.String
     */
    @Path("saluda")
    @GET
    @Produces("text/html")
    public String saluda() {
        return "hola Mundo!!!!!";
    }
    
    @Path("despidete")
    @GET
    @Produces("application/json")
    public String despidete() {
        return "{\"aqui\":\"hola Mundo!!!!!\"}";
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
    
    @GET
    @Path("getPersonaList")
    @Produces("application/json")
    public String getPersonaList(){
        Gson gson =new Gson();        
        List listaPersona = null;
        String pers="";
        try{
            listaPersona = personahelper.personaList();
            //pers = personahelper.personaId();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return gson.toJson(listaPersona);
    }
    
    @POST
    @Path("savePersona")
    @Consumes("application/json")
    public Response savePersona(String data){
        Response respuesta = null;
        Gson gson = new Gson();
        Persona persona = gson.fromJson(data, Persona.class);
        System.out.println("----------------persona data " +persona.getIdPersona());
        System.out.println("----------------persona data " +persona.getNombre());
        System.out.println("----------------persona data " +persona.getApellidoPat());
        System.out.println("----------------persona data " +persona.getApellidoMat());
        System.out.println("----------------persona data " +persona.getFechaNac());
        try{
            personahelper.savePersona(persona.getNombre(),persona.getApellidoPat(),persona.getApellidoMat(),persona.getFechaNac());
            respuesta = Response.status(200).entity(persona).build();
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("...............Exception here ____:::::" + ex);
            respuesta = Response.status(500).entity(persona).build();
        }
        return respuesta;
    }
    
    @GET
    @Path("updatePersona")
    @Consumes("application/json")
    public void updatePersona(@QueryParam("idPersona") String idPersona, @QueryParam("nombre") String nombre){
        Gson gson = new Gson();
        try{
            personahelper.updatePersona(Integer.parseInt(idPersona), nombre);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
