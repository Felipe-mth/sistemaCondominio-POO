package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.TransacaoMoradores;
import conexaoBancoDeDados.JPAUtil;
import javax.persistence.Query;
import java.util.List;

public class TransacaoMoradorDAO implements crudDAO<TransacaoMoradores>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<TransacaoMoradores> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from TransacaoMoradores a", TransacaoMoradores.class);
        @SuppressWarnings("unchecked")
        List<TransacaoMoradores> transacaoMoradores = q.getResultList();

        return transacaoMoradores;
    }

    @Override
    public TransacaoMoradores findByName(String nome) {
        return null;
    }

    public TransacaoMoradores findById(int id) {
        try {
            String consultaId = "from TransacaoMorador where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<TransacaoMoradores> transacaoMoradorId = q.getResultList();
            int index = -1;

            for(int i = 0; i < transacaoMoradorId.size(); i++) {
                if(transacaoMoradorId.get(i).getId() == id) {
                    index = i;
                }
            }
            return transacaoMoradorId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(TransacaoMoradores transacaoMorador) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.persist(transacaoMorador);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(TransacaoMoradores transacaoMorador) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(transacaoMorador);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(TransacaoMoradores transacaoMorador) {
        try {
            TransacaoMoradores transacaoMoradorDel = connection.em.getReference(TransacaoMoradores.class, transacaoMorador.getId());
            connection.tx.begin();
            connection.em.remove(transacaoMoradorDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
