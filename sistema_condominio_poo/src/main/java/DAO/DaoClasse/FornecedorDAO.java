package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Fornecedor;

import java.util.List;
import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;

public class FornecedorDAO implements crudDAO<Fornecedor>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<Fornecedor> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Fornecedor a", Fornecedor.class);
        @SuppressWarnings("unchecked")
        List<Fornecedor> fornecedores = q.getResultList();

        return fornecedores;
    }

    @Override
    public Fornecedor findByName(String nome) {
        try {
            String consultaId = "from Fornecedor where nome=" + nome;
            Query q = connection.em.createQuery(consultaId);
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
            Query q = connection.em.createQuery(consultaId);
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

            connection.tx.begin();
            connection.em.persist(fornecedor);
            connection.tx.commit();
            connection.em.close();

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

            connection.tx.begin();
            connection.em.merge(fornecedor);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Fornecedor fornecedor) {
        try {
            Fornecedor fornecedorDel = connection.em.getReference(Fornecedor.class, fornecedor.getId());
            connection.tx.begin();
            connection.em.remove(fornecedorDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
    
}
