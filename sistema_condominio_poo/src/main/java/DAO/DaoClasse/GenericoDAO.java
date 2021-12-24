package DAO.DaoClasse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class GenericoDAO {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    public List<Object> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Object a", Object.class);

        List<Object> consulta = q.getResultList();

        return consulta;
    }

    public Object findById(String classe,int id) {
        try {
            String consultaId = "from"+ classe  +"where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            List<Object> objID = q.getResultList();

            return objID.get(0);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }

    }

    public List<Object> findByName(String nome) {
        try {
            String consultaId = "from Object where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            List<Object> objNome = q.getResultList();

            return objNome;

        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(Object obj) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(obj);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(Object obj,int id) {
        try {
            Object objDel = em.getReference(Object.class, id);
            tx.begin();
            em.remove(objDel);
            tx.commit();

        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }

    public void updateDados(Object carro) {
    }

    
}
