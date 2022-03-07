package occ.ues.edu.sv.bachestpi.control;

import java.io.Serializable;
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
   
    public List<Estado> findEstadoEntities(boolean all, int maxResults, int firstResult) {
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Estado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    
}
