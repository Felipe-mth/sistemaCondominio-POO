package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Almoxarifado;
import Model.Funcionario;
import conexaoBancoDeDados.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class AlmoxarifadoDAO implements crudDAO<Almoxarifado> {
    JPAUtil connection = new JPAUtil();

    @Override
    public List<Almoxarifado> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Almoxarifado a", Almoxarifado.class);
        @SuppressWarnings("unchecked")
        List<Almoxarifado> almoxarifado = q.getResultList();

        return almoxarifado;
    }

    public Almoxarifado findById(int id) {
        try {
            String consultaId = "from Almoxarifado where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Almoxarifado> almoxarifadoId = q.getResultList();
            int index = -1;

            for(int i = 0; i < almoxarifadoId.size(); i++) {
                if(almoxarifadoId.get(i).getId() == id) {
                    index = i;
                }
            }
            return almoxarifadoId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public Almoxarifado findByName(String nome) {
        return null;
    }


    public void insertDados(Funcionario funcionario, String telefone, String email) {
        try {
            System.out.println("======================================");
            Almoxarifado almoxarifado = new Almoxarifado(funcionario, telefone, email);
            connection.tx.begin();
            connection.em.persist(almoxarifado);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(Almoxarifado almoxarifado) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(almoxarifado);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Almoxarifado almoxarifado) {
        try {
            Almoxarifado almoxarifadoDel = connection.em.getReference(Almoxarifado.class, almoxarifado.getId());
            connection.tx.begin();
            connection.em.remove(almoxarifadoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
