package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.TransacaoMoradores;
import condominio.poo.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class TransacaoMoradorDAO implements crudDAO<TransacaoMoradores>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<TransacaoMoradores> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from TransacaoMoradores a", TransacaoMoradores.class);
        @SuppressWarnings("unchecked")
        List<TransacaoMoradores> transacaoMoradores = q.getResultList();

        return transacaoMoradores;
    }

    @Override
    public TransacaoMoradores findByName(String nome) {
        return null;
    }

    public TransacaoMoradores findById(int id) {
        try {
            String consultaId = "from TransacaoMorador where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<TransacaoMoradores> transacaoMoradorId = q.getResultList();
            int index = -1;

            for(int i = 0; i < transacaoMoradorId.size(); i++) {
                if(transacaoMoradorId.get(i).getId() == id) {
                    index = i;
                }
            }
            return transacaoMoradorId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(TransacaoMoradores transacaoMorador) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(transacaoMorador);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(TransacaoMoradores transacaoMorador) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(transacaoMorador);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(TransacaoMoradores transacaoMorador) {
        try {
            TransacaoMoradores transacaoMoradorDel = em.getReference(TransacaoMoradores.class, transacaoMorador.getId());
            tx.begin();
            em.remove(transacaoMoradorDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
