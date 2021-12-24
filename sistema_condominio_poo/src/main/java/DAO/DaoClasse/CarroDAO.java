package DAO.DaoClasse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;
import DAO.interfaces.*;
import Model.*;

public class CarroDAO implements crudDAO<Carro> {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    public List<Carro> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Carro a", Carro.class);

        List<Carro> autos = q.getResultList();

        return autos;
    }

    public Carro findById(String id) {
        try {
            String consultaId = "from Carro where placa=" + id;
            Query q = (Query) em.createQuery(consultaId);
            List<Carro> carroID = q.getResultList();

            return carroID.get(0);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }

    }

    public List<Carro> findByName(String nome) {
        try {
            String consultaId = "from Carro where modelo=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            List<Carro> carroNome = q.getResultList();

            return carroNome;

        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(Carro carro) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(carro);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(Carro carro) {
        try {
            Carro carroDel = em.getReference(Carro.class, carro.getPlaca());
            tx.begin();
            em.remove(carroDel);
            tx.commit();

        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }

    public void updateDados(Carro carro) {
    }
}
