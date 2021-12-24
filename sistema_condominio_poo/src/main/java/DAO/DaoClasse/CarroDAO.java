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
        @SuppressWarnings("unchecked")
        List<Carro> autos = q.getResultList();

        return autos;
    }

    public Carro findById(String id) {
        try {
            String consultaId = "from Carro where placa=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Carro> carroId = q.getResultList();
            int index = -1;

            for(int i = 0; i < carroId.size(); i++) {
                if(carroId.get(i).getPlaca() == id) {
                    index = i;
                }
            }

            return carroId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Carro findByName(String nome) {
        try {
            String consultaId = "from Carro where modelo=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Carro> carroNome = q.getResultList();
            
            int index = -1;

            for(int i = 0; i < carroNome.size(); i++) {
                if(carroNome.get(i).getModelo() == nome) {
                    index = i;
                }
            }

            return carroNome.get(index);
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
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(carro);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }
}
