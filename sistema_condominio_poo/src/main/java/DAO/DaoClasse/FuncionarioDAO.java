package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Funcionario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;


import Model.Endereco;
public class FuncionarioDAO {
    JPAUtil connection = new JPAUtil();
    
    
    public List<Funcionario> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Funcionario a", Funcionario.class);
        @SuppressWarnings("unchecked")
        List<Funcionario> funcionarios = q.getResultList();

        return funcionarios;
    }

   
    public Funcionario findByName(String nome) {
        try {
            String consultaId = "from Funcionario where nome=" + nome;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Funcionario> funcionariosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < funcionariosId.size(); i++) {
                if(funcionariosId.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return funcionariosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Funcionario findById(int id) {
        try {
            String consultaId = "from Funcionario where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Funcionario> funcionariosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < funcionariosId.size(); i++) {
                if(funcionariosId.get(i).getId() == id) {
                    index = i;
                }
            }
            return funcionariosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    
    public void insertDados(String cpf, Endereco endereco, String cargo, double salario, String turno, String telefone, String nome) {
        try {
            System.out.println("======================================");
            Funcionario funci = new Funcionario(cpf, endereco, cargo, salario, turno, telefone, nome);
            connection.tx.begin();
            connection.em.persist(funci);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }


    public void updateDados(Funcionario func) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(func);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    
    public void deleteDados(Funcionario func) {
        try {
            Funcionario funcionarioDel = connection.em.getReference(Funcionario.class, func.getId());
            connection.tx.begin();
            connection.em.remove(funcionarioDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
