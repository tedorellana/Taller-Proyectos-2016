package com.pojos;
// Generated 01-sep-2016 21:52:10 by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String contraseña;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String contraseña) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.contraseña = contraseña;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return this.contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }




}


