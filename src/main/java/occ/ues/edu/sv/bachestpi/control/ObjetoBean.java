package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Objeto;

public class ObjetoBean {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
        
    public boolean crear(Objeto nuevo){
        
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
        Objeto eliminar;
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
    
    public boolean modificar(Objeto mod) throws NonexistentEntityException{
        
        try {
            tx.begin();
            em.find(Objeto.class, mod.getIdObjeto());
            // Si el registro con el id obtenido no existe, se creara uno nuevo
            em.merge(mod);
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
    
    public boolean buscar(Long id){
        try {
            tx.begin();
            em.createQuery("select * from estado where id_objeto="+id);
            tx.commit();
            System.out.println(em.createQuery("select * from estado where id_estado=2"));
            System.out.println("Registro con id "+id+" encontrado");
            return true;
        } catch (Exception e) {
            tx.rollback();
        }
        return false;
    }
}
