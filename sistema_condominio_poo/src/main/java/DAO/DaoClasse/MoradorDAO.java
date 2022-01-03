package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

import Model.*;

public class MoradorDAO implements crudDAO<Morador> {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Morador> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Morador a", Morador.class);
        @SuppressWarnings("unchecked")
        List<Morador> moradores = q.getResultList();
        return moradores;
    }

    @Override
    public Morador findByName(String nome) {
        try {
            String consultaId = "from Morador where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Morador> moradoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < moradoresId.size(); i++) {
                if(moradoresId.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return moradoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Morador findById(int id) {
        try {
            String consultaId = "from Morador where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Morador> moradoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < moradoresId.size(); i++) {
                if(moradoresId.get(i).getId() == id) {
                    index = i;
                }
            }
            return moradoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Morador morador) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(morador);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(Morador morador) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(morador);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Morador morador) {
        try {
            Morador moradorDel = em.getReference(Morador.class, morador.getId());
            tx.begin();
            em.remove(moradorDel);
            tx.commit();

        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    } 
}   
