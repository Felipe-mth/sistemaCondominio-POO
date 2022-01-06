package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Fornecedor;
import Model.Produtos;
import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;

public class ProdutosDAO {
    JPAUtil connection = new JPAUtil();

    public List<Produtos> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Produtos a", Produtos.class);
        @SuppressWarnings("unchecked")
        List<Produtos> produtos = q.getResultList();

        return produtos;
    }

    public Produtos findByName(String nome) {
        try {
            String consultaId = "from Produtos where nome=" + nome;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Produtos> produtosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < produtosId.size(); i++) {
                if(produtosId.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return produtosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Produtos findById(int id) {
        try {
            String consultaId = "from Produtos where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Produtos> produtosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < produtosId.size(); i++) {
                if(produtosId.get(i).getId() == id) {
                    index = i;
                }
            }
            return produtosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(Fornecedor fornecedor, int quantidadeMinima, double preco, String nome, int quantidade) {
        try {
            System.out.println("======================================");
            Produtos prod = new Produtos(fornecedor, quantidadeMinima, preco, nome, quantidade);
            connection.tx.begin();
            connection.em.persist(prod);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void updateDados(Produtos prod) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(prod);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(Produtos prod) {
        try {
            Produtos prodDel = connection.em.getReference(Produtos.class, prod.getId());
            connection.tx.begin();
            connection.em.remove(prodDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
