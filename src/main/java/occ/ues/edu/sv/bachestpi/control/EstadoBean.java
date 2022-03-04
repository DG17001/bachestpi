package occ.ues.edu.sv.bachestpi.control;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Estado;

public class EstadoBean implements Serializable{

    public boolean crear(Estado nuevo){

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
        }
        return false;
    }

    public boolean eliminar(Integer id) throws NonexistentEntityException{
        Estado eliminar;
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        eliminar=em.getReference(Estado.class,id);
        
        try {
            tx.begin();
            eliminar.getIdEstado();
            em.remove(eliminar);
            tx.commit();
            return true;
            
        } catch (EntityNotFoundException enfe) {
            tx.rollback();
        }
        return false;
    }
}
