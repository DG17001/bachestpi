package occ.ues.edu.sv.bachestpi.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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

}
