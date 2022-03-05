package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Ruta;

public class RutaBean {

    public boolean crear(Ruta nueva) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(nueva);
            et.commit();
            return true;
            
        } catch (Exception e) {
            et.rollback();
        }

        return false;
    }
    
    public boolean eliminar(Long id) throws NonexistentEntityException{
        Ruta eliminar;
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        eliminar=em.getReference(Ruta.class, id);
        
        try {
            et.begin();
            eliminar.getIdRuta();
            em.remove(eliminar);
            et.commit();
            return true;
            
        } catch (Exception e) {
            et.rollback();
            
        }
        return false;
    }
    
    public boolean modificar(Ruta modificar){
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        
        try {
            et.begin();
            em.merge(modificar);
            et.commit();
            return true;
            
        } catch (Exception e) {
        }
        return false;
    }

}
