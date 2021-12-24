package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Produtos;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class ProdutosDAO implements crudDAO<Produtos>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Produtos> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Produtos a", Produtos.class);
        @SuppressWarnings("unchecked")
        List<Produtos> produtos = q.getResultList();

        return produtos;
    }

    @Override
    public Produtos findByName(String nome) {
        try {
            String consultaId = "from Produtos where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Produtos> produtosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < produtosId.size(); i++) {
                if(produtosId.get(i).getNome() == nome) {
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
            Query q = (Query) em.createQuery(consultaId);
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

    @Override
    public void insertDados(Produtos prod) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(prod);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }  
    }

    @Override
    public void updateDados(Produtos prod) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(prod);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
    }

    @Override
    public void deleteDados(Produtos prod) {
        try {
            Produtos prodDel = em.getReference(Produtos.class, prod.getId());
            tx.begin();
            em.remove(prodDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
