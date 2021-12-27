package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Endereco;
import condominio.poo.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class EnderecoDAO implements crudDAO<Endereco> {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Endereco> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Endereco a", Endereco.class);
        @SuppressWarnings("unchecked")
        List<Endereco> enderecos = q.getResultList();

        return enderecos;
    }

    public Endereco findById(int id) {
        try {
            String consultaId = "from Endereco where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
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

            tx.begin();
            em.persist(endereco);
            tx.commit();
            em.close();

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

            tx.begin();
            em.merge(endereco);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Endereco endereco) {
        try {
            Endereco enderecoDel = em.getReference(Endereco.class, endereco.getId());
            tx.begin();
            em.remove(enderecoDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
