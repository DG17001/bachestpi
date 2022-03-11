package occ.ues.edu.sv.bachestpi.control;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import occ.ues.edu.sv.bachestpi.entity.Estado;
        
public class EstadoBean extends AbstractDataAccess<Estado>implements Serializable{
    
    @PersistenceContext (name = "bachesUP")
    EntityManager em;

    public EstadoBean(){
        super(Estado.class);
    }
    
    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public void crear(Estado nuevo) throws IllegalArgumentException, IllegalStateException {
        super.crear(nuevo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object id) throws IllegalArgumentException, IllegalStateException {
        super.eliminar(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Estado clase) throws IllegalArgumentException, IllegalStateException {
        super.modificar(clase); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estado findById(Object id) throws IllegalArgumentException, IllegalStateException {
        return super.findById(1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estado> findAll() throws IllegalStateException {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estado> findRange(int first, int pageSize) throws IllegalArgumentException, IllegalStateException {
        return super.findRange(1, 25); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public Long contar() throws IllegalStateException {
        return super.contar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
/*       
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
    }*/

    public EstadoBean(Class clase) {
        super(clase);
    }

    
}
