package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Estado;
import occ.ues.edu.sv.bachestpi.entity.Ruta;

public class RutaBean {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    
    public boolean crear(Ruta nueva) {   

        try {
            et.begin();
            em.persist(nueva);
            et.commit();
            return true;
            
        } catch (Exception e) {
            et.rollback();
        }finally {
           if (em!=null){
            em.close();
        }
        }

        return false;
    }
    
    public boolean eliminar(Long id) throws NonexistentEntityException{
        Ruta eliminar;
        eliminar=em.getReference(Ruta.class, id);
        
        try {
            et.begin();
            eliminar.getIdRuta();
            em.remove(eliminar);
            et.commit();
            return true;
            
        } catch (Exception e) {
            et.rollback();
        }finally {
           if (em!=null){
            em.close();
        }
        }
        return false;
    }
    
    public boolean modificar(Ruta modificar) throws NonexistentEntityException{
        
        try {
            et.begin();
            em.find(Estado.class, modificar.getIdRuta());
            // Si el registro con el id obtenido no existe, se creara uno nuevo
            em.merge(modificar);
            et.commit();
            return true;
            
        } catch (RuntimeException e) {
            if(et.isActive()){
                et.rollback();
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
            et.begin();
            em.createQuery("select * from estado where id_ruta="+id);
            et.commit();
            System.out.println(em.createQuery("select * from estado where id_estado=2"));
            System.out.println("Registro con id "+id+" encontrado");
            return true;
        } catch (Exception e) {
            et.rollback();
        }
        return false;
    }

}
