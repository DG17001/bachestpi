package occ.ues.edu.sv.bachestpi.control;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Objeto;

public class ObjetoBean extends AbstractDataAccess<Objeto>implements Serializable{

    @PersistenceContext (name = "bachesUP")
    EntityManager em;
    
    public ObjetoBean() {
        super(Objeto.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public void crear(Objeto clase) throws IllegalArgumentException, IllegalStateException {
        super.crear(clase); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object id) throws IllegalArgumentException, IllegalStateException {
        super.eliminar(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Objeto clase) throws IllegalArgumentException, IllegalStateException {
        super.modificar(clase); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Objeto findById(Object id) throws IllegalArgumentException, IllegalStateException {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Objeto> findAll() throws IllegalStateException {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Objeto> findRange(int first, int pageSize) throws IllegalArgumentException, IllegalStateException {
        return super.findRange(first, pageSize); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long contar() throws IllegalStateException {
        return super.contar(); //To change body of generated methods, choose Tools | Templates.
    }
}