package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Funcionario;
import Model.TransacaoFuncionario;
import conexaoBancoDeDados.JPAUtil;
import javax.persistence.Query;
import java.util.List;

public class TransacaoFuncionarioDAO {
    JPAUtil connection = new JPAUtil();

    public List<TransacaoFuncionario> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from TransacaoFuncionario a", TransacaoFuncionario.class);
        @SuppressWarnings("unchecked")
        List<TransacaoFuncionario> transacaoFuncionarios = q.getResultList();

        return transacaoFuncionarios;
    }

    public TransacaoFuncionario findByName(String nome) {
        return null;
    }

    public TransacaoFuncionario findById(int id) {
        try {
            String consultaId = "from TransacaoFuncionario where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<TransacaoFuncionario> transacaoFuncionarioId = q.getResultList();
            int index = -1;

            for(int i = 0; i < transacaoFuncionarioId.size(); i++) {
                if(transacaoFuncionarioId.get(i).getId() == id) {
                    index = i;
                }
            }
            return transacaoFuncionarioId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(double valor, String descricao, Funcionario funcionario) {
        try {
            System.out.println("======================================");
            TransacaoFuncionario transacaoFuncionario = new TransacaoFuncionario(valor, descricao, funcionario);
            connection.tx.begin();
            connection.em.persist(transacaoFuncionario);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void updateDados(TransacaoFuncionario transacaoFuncionario) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(transacaoFuncionario);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(TransacaoFuncionario transacaoFuncionario) {
        try {
            TransacaoFuncionario transacaoFuncionarioDel = connection.em.getReference(TransacaoFuncionario.class, transacaoFuncionario.getId());
            connection.tx.begin();
            connection.em.remove(transacaoFuncionarioDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
