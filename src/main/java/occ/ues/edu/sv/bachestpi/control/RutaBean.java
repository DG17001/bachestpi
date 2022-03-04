package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import occ.ues.edu.sv.bachestpi.entity.Estado;

public class RutaBean {

    public boolean crear(Estado nuevo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bachesUP");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {

            et.begin();
            em.persist(nuevo);
            et.commit();
            return true;
        } catch (Exception e) {
            et.rollback();
        }

        return false;
    }

}
