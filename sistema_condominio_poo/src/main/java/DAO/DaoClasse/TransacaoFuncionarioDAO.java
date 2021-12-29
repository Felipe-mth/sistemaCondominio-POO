package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.TransacaoFuncionario;
import condominio.poo.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class TransacaoFuncionarioDAO implements crudDAO<TransacaoFuncionario> {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<TransacaoFuncionario> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from TransacaoFuncionario a", TransacaoFuncionario.class);
        @SuppressWarnings("unchecked")
        List<TransacaoFuncionario> transacaoFuncionarios = q.getResultList();

        return transacaoFuncionarios;
    }

    @Override
    public TransacaoFuncionario findByName(String nome) {
        return null;
    }

    public TransacaoFuncionario findById(int id) {
        try {
            String consultaId = "from TransacaoFuncionario where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<TransacaoFuncionario> transacaoFuncionarioId = q.getResultList();
            int index = -1;

            for(int i = 0; i < transacaoFuncionarioId.size(); i++) {
                if(transacaoFuncionarioId.get(i).getId() == id) {
                    index = i;
                }
            }
            return transacaoFuncionarioId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(TransacaoFuncionario transacaoFuncionario) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(transacaoFuncionario);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(TransacaoFuncionario transacaoFuncionario) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(transacaoFuncionario);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(TransacaoFuncionario transacaoFuncionario) {
        try {
            TransacaoFuncionario transacaoFuncionarioDel = em.getReference(TransacaoFuncionario.class, transacaoFuncionario.getId());
            tx.begin();
            em.remove(transacaoFuncionarioDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
