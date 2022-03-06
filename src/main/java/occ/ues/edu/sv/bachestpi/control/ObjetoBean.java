package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Objeto;

public class ObjetoBean {
    
    public boolean crear(Objeto nuevo){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

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

    
    public boolean eliminar(Integer id) throws NonexistentEntityException{
        Objeto eliminar;
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        eliminar=em.getReference(Objeto.class,id);
        
        try {
            tx.begin();
            eliminar.getIdObjeto();
            em.remove(eliminar);
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
    
}
