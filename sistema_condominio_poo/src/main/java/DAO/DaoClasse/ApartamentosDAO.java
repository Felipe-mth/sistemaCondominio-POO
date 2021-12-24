package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Apartamentos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class ApartamentosDAO implements crudDAO<Apartamentos>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Apartamentos> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Apartamentos a", Apartamentos.class);
        @SuppressWarnings("unchecked")
        List<Apartamentos> apartamentos = q.getResultList();

        return apartamentos;
    }

    @Override
    public Apartamentos findByName(String nome) {
        return null;
    }

    public Apartamentos findById(int id) {
        try {
            String consultaId = "from Apartamentos where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Apartamentos> apartamentosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < apartamentosId.size(); i++) {
                if(apartamentosId.get(i).getnumeroDoApartamento() == id) {
                    index = i;
                }
            }
            return apartamentosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Apartamentos apart) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(apart);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }  
    }

    @Override
    public void updateDados(Apartamentos apart) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(apart);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Apartamentos apart) {
        try {
            Apartamentos apartamentoDel = em.getReference(Apartamentos.class, apart.getnumeroDoApartamento());
            tx.begin();
            em.remove(apartamentoDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
