package occ.ues.edu.sv.bachestpi.control;

import com.sun.jdi.connect.spi.Connection;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Estado;
        
public class EstadoBean implements Serializable{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
       
    public boolean crear(Estado nuevo){      
        
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
        Estado eliminar;
        eliminar=em.getReference(Estado.class,id);
        
        try {
            tx.begin();
            eliminar.getIdEstado();
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
    
    public boolean modificar(Estado mod) throws NonexistentEntityException{
        
        try {
            tx.begin();
            em.find(Estado.class, mod.getIdEstado());
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
     
    
    public boolean buscar(Integer id){
        try {
            tx.begin();
            em.createQuery("select * from estado where id_estado=2");
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
