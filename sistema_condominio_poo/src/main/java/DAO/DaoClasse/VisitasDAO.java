package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Visitas;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class VisitasDAO implements crudDAO<Visitas>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Visitas> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Produtos a", Visitas.class);
        @SuppressWarnings("unchecked")
        List<Visitas> visitantes = q.getResultList();

        return visitantes;
    }

    @Override
    public Visitas findByName(String nome) {
        try {
            String consultaId = "from Visitas where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Visitas> visitasName = q.getResultList();
            int index = -1;

            for(int i = 0; i < visitasName.size(); i++) {
                if(visitasName.get(i).getNome() == nome) {
                    index = i;
                }
            }

            return visitasName.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Visitas findById(int id) {
        try {
            String consultaId = "from Visitas where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Visitas> visitasId = q.getResultList();
            int index = -1;

            for(int i = 0; i < visitasId.size(); i++) {
                if(visitasId.get(i).getId() == id) {
                    index = i;
                }
            }
            return visitasId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Visitas visitas) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(visitas);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
    }

    @Override
    public void updateDados(Visitas visitas) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(visitas);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
        
    }

    @Override
    public void deleteDados(Visitas visitas) {
        try {
            Visitas visitasDel = em.getReference(Visitas.class, visitas.getId());
            tx.begin();
            em.remove(visitasDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
