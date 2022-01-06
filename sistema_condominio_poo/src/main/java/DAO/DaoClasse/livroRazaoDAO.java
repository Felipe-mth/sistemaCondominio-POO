package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.livroRazao;
import conexaoBancoDeDados.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class livroRazaoDAO implements crudDAO<livroRazao>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<livroRazao> findAll() {
        return null;
    }

    @Override
    public livroRazao findByName(String nome) {
        return null;
    }

    @Override
    public void insertDados(int mes,String criadoPor, double montante) {
        try {
            System.out.println("======================================");
            livroRazao livroRazao = new livroRazao(mes, criadoPor, montante);
            connection.tx.begin();
            connection.em.persist(livroRazao);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(livroRazao livroRazao) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(livroRazao);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(livroRazao livroRazao) {
        try {
            livroRazao livroRazaoDel = connection.em.getReference(livroRazao.class, livroRazao.getId());
            connection.tx.begin();
            connection.em.remove(livroRazaoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
