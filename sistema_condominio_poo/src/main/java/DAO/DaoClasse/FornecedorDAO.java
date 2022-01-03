package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Fornecedor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class FornecedorDAO implements crudDAO<Fornecedor>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Fornecedor> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Fornecedor a", Fornecedor.class);
        @SuppressWarnings("unchecked")
        List<Fornecedor> fornecedores = q.getResultList();

        return fornecedores;
    }

    @Override
    public Fornecedor findByName(String nome) {
        try {
            String consultaId = "from Fornecedor where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Fornecedor> fornecedoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < fornecedoresId.size(); i++) {
                if(fornecedoresId.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return fornecedoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Fornecedor findById(int id) {
        try {
            String consultaId = "from Fornecedor where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Fornecedor> fornecedoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < fornecedoresId.size(); i++) {
                if(fornecedoresId.get(i).getId() == id) {
                    index = i;
                }
            }
            return fornecedoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Fornecedor fornecedor) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(fornecedor);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(Fornecedor fornecedor) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(fornecedor);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Fornecedor fornecedor) {
        try {
            Fornecedor fornecedorDel = em.getReference(Fornecedor.class, fornecedor.getId());
            tx.begin();
            em.remove(fornecedorDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
    
}
