package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Endereco;
import conexaoBancoDeDados.JPAUtil;

import javax.persistence.Query;
import java.util.List;

public class EnderecoDAO implements crudDAO<Endereco> {
    JPAUtil connection = new JPAUtil();

    @Override
    public List<Endereco> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Endereco a", Endereco.class);
        @SuppressWarnings("unchecked")
        List<Endereco> enderecos = q.getResultList();

        return enderecos;
    }

    public Endereco findById(int id) {
        try {
            String consultaId = "from Endereco where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Endereco> enderecosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < enderecosId.size(); i++) {
                if(enderecosId.get(i).getId() == id) {
                    index = i;
                }
            }
            return enderecosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public Endereco findByName(String nome) {
        return null;
    }

    @Override
    public void insertDados(Endereco endereco) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.persist(endereco);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(Endereco endereco) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(endereco);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Endereco endereco) {
        try {
            Endereco enderecoDel = connection.em.getReference(Endereco.class, endereco.getId());
            connection.tx.begin();
            connection.em.remove(enderecoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
