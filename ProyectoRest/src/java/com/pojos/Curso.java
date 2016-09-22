package com.pojos;
// Generated 22-sep-2016 0:33:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {


     private int idCurso;
     private String nombre;
     private String detalle;
     private Set<CentroEducativoCurso> centroEducativoCursos = new HashSet<CentroEducativoCurso>(0);

    public Curso() {
    }

	
    public Curso(int idCurso, String nombre) {
        this.idCurso = idCurso;
        this.nombre = nombre;
    }
    public Curso(int idCurso, String nombre, String detalle, Set<CentroEducativoCurso> centroEducativoCursos) {
       this.idCurso = idCurso;
       this.nombre = nombre;
       this.detalle = detalle;
       this.centroEducativoCursos = centroEducativoCursos;
    }
   
    public int getIdCurso() {
        return this.idCurso;
    }
    
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDetalle() {
        return this.detalle;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Set<CentroEducativoCurso> getCentroEducativoCursos() {
        return this.centroEducativoCursos;
    }
    
    public void setCentroEducativoCursos(Set<CentroEducativoCurso> centroEducativoCursos) {
        this.centroEducativoCursos = centroEducativoCursos;
    }




}

