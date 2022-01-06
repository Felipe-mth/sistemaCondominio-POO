package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Almoxarifado;
import Model.livroDiario;
import conexaoBancoDeDados.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class livroDiarioDAO implements crudDAO<livroDiario>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<livroDiario> findAll() {
        return null;
    }

    @Override
    public livroDiario findByName(String nome) {
        return null;
    }

    @Override
    public void insertDados(livroDiario livroDiario) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.persist(livroDiario);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(livroDiario livroDiario) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(livroDiario);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(livroDiario livroDiario) {
        try {
            livroDiario livroDiarioDel = connection.em.getReference(livroDiario.class, livroDiario.getId());
            connection.tx.begin();
            connection.em.remove(livroDiarioDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
