package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.TransacaoProduto;
import conexaoBancoDeDados.JPAUtil;
import javax.persistence.Query;
import java.util.List;

public class TransacaoProdutoDAO implements crudDAO<TransacaoProduto>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<TransacaoProduto> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from TransacaoProduto a", TransacaoProduto.class);
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
            Query q = connection.em.createQuery(consultaId);
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

            connection.tx.begin();
            connection.em.persist(transacaoProduto);
            connection.tx.commit();
            connection.em.close();

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

            connection.tx.begin();
            connection.em.merge(transacaoProduto);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(TransacaoProduto transacaoProduto) {
        try {
            TransacaoProduto transacaoProdutoDel = connection.em.getReference(TransacaoProduto.class, transacaoProduto.getId());
            connection.tx.begin();
            connection.em.remove(transacaoProdutoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
