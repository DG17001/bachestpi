/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Objeto;
import occ.ues.edu.sv.bachestpi.entity.ObjetoEstado;

/**
 *
 * @author magdiel
 */
public class ObjetoEstadoBean {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    
    public boolean crear(ObjetoEstado nuevo){      
        try {
            tx.begin();
            em.persist(nuevo);
            tx.commit();
            return true;
            
        } catch (Exception e) {
            tx.rollback();
        }finally {
           if (em!=null){
            em.close();
        }
        }
        return false;
    }
    
    public boolean eliminar(Long id) throws NonexistentEntityException{
        ObjetoEstado borrar;
        borrar=em.getReference(ObjetoEstado.class, id);
        
        try {
            tx.begin();
            borrar.getIdObjetoEstado();
            em.remove(borrar);
            tx.commit();
            return true;
            
        } catch (Exception e) {
            tx.rollback();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        return true;
    }
    
    public boolean modificar(ObjetoEstado modificar) throws NonexistentEntityException{
        try {
            tx.begin();
            em.find(ObjetoEstado.class, modificar.getIdObjeto());
            // Si el registro con el id obtenido no existe, se creara uno nuevo
            em.merge(modificar);
            tx.commit();
            return true;
            
        } catch (RuntimeException e) {
            if(tx.isActive()){
                tx.rollback();
            }
        }finally {
           if (em!=null){
            em.close();
        }
        }
        return false;
    }
    
}
