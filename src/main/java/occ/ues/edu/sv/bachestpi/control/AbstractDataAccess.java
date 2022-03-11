/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author magdiel
 */
public abstract class AbstractDataAccess<T> implements Serializable{
    
    public abstract EntityManager getEntityManager();
    
    public void crear(T nuevo) throws IllegalArgumentException,IllegalStateException{
        if (nuevo != null){
            EntityManager em=null;
            try {
                em=getEntityManager();
            } catch (Exception e) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE,"Entity nulo");
            }
            if(em!=null){
                em.persist(nuevo);
                return;
            }else{
                throw new IllegalStateException();
            }
        }
        throw new IllegalArgumentException();
    }
}
