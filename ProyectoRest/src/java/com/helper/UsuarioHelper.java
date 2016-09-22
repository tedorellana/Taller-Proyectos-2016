/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper;

import com.utility.HibernateUtil;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author TED
 */
public class UsuarioHelper {
    
    public void saveUsuario(String nombreUsuario, String contrasenaUsuario, String nombre, String apellidoPat,String apellidoMat,Date fechaNac, String sexo, String correoElectronico, String telefono, String direccion){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Query query = session.createSQLQuery("Insert into usuario u, persona p "
                + "   (p.nombre,p.apellidoPat,p.apellidoMat,p.fechaNac,p.sexo,p.correoElectronico,p.telefono,p.direccion,p.fk_tipo_persona,u.nombre,u.constrasena) "
                + "   values (:pnombre, :papellidoPat, :papellidoMat, :pfechaNac,:psexo,:pcorreoElectronico,:ptelefono,:pdireccion,:pfk_tipo_persona,:unombre,:uconstrasena)");
        query.setParameter("pnombre", nombre);
        query.setParameter("papellidoPat", apellidoPat);
        query.setParameter("papellidoMat", apellidoMat);
        query.setParameter("pfechaNac", fechaNac);
        query.setParameter("psexo", sexo);
        query.setParameter("pcorreoElectronico", correoElectronico);
        query.setParameter("ptelefono", telefono);
        query.setParameter("pdireccion", direccion);
        query.setParameter("pfk_tipo_persona", correoElectronico);
        query.setParameter("unombre", nombreUsuario);
        query.setParameter("ucontrasena", contrasenaUsuario);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }
    
}
