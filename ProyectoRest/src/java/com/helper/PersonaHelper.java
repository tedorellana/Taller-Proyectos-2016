/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper;

import com.google.gson.Gson;
import com.pojos.Persona;
import com.utility.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;



/**
 *
 * @author TED
 */
public class PersonaHelper {
    
    public PersonaHelper(){
    }
    
    public List<Persona> personaList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createSQLQuery("Select * from Persona").setResultTransformer(Transformers.aliasToBean(Persona.class));
        List<Persona> resultList=q.list();
        transaction.commit();
        session.close();
        return resultList;
    }
    
    public String personaId(int idPersona){
        Gson gson = new Gson();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Persona persona = new Persona();
        Query q = session.createSQLQuery("Select * from Persona where idPersona = " + idPersona );
        List<Persona> lista = q.list();
        String json = gson.toJson(persona);
        return json;
    }
    
    public void savePersona(String nombre, String apellidoPat,String apellidoMat,Date fechaNac){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Query query = session.createSQLQuery("Insert into persona (nombre,apellidoPat,apellidoMat,fechaNac) values (:nombre, :apellidoPat, :apellidoMat, :fechaNac)");
        query.setParameter("nombre", nombre);
        query.setParameter("apellidoPat", apellidoPat);
        query.setParameter("apellidoMat", apellidoMat);
        query.setParameter("fechaNac", fechaNac);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }
    
    public void updatePersona(int personaId,String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createSQLQuery("update persona set nombre='"+name+"' where idPersona="+personaId);
        q.executeUpdate();
        transaction.commit();
        session.close();
    }
    
    public void deletePersona(int personaId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createSQLQuery("delete from persona where idPersona="+personaId);
        q.executeUpdate();
        transaction.commit();
        session.close();
    }
    
}
