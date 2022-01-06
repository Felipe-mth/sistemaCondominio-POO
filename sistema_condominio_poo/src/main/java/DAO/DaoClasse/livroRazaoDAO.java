package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.livroRazao;
import conexaoBancoDeDados.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class livroRazaoDAO {
    JPAUtil connection = new JPAUtil();

    public List<livroRazao> findAll() {
        return null;
    }

    public livroRazao findByName(String nome) {
        return null;
    }

    public void insertDados(int mes, String criadoPor, double montante) {
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
