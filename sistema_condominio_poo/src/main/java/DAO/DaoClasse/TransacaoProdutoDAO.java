package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.TransacaoProduto;
import condominio.poo.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class TransacaoProdutoDAO implements crudDAO<TransacaoProduto>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<TransacaoProduto> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from TransacaoProduto a", TransacaoProduto.class);
        @SuppressWarnings("unchecked")
        List<TransacaoProduto> transacaoProdutos = q.getResultList();

        return transacaoProdutos;
    }

    @Override
    public TransacaoProduto findByName(String nome) {
        return null;
    }

    public TransacaoProduto findById(int id) {
        try {
            String consultaId = "from TransacaoProduto where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<TransacaoProduto> transacaoProdutosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < transacaoProdutosId.size(); i++) {
                if(transacaoProdutosId.get(i).getId() == id) {
                    index = i;
                }
            }
            return transacaoProdutosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(TransacaoProduto transacaoProduto) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(transacaoProduto);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(TransacaoProduto transacaoProduto) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(transacaoProduto);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(TransacaoProduto transacaoProduto) {
        try {
            TransacaoProduto transacaoProdutoDel = em.getReference(TransacaoProduto.class, transacaoProduto.getId());
            tx.begin();
            em.remove(transacaoProdutoDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
