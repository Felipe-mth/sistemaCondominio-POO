package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Funcionario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class FuncionarioDAO implements crudDAO<Funcionario>{
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();
    
    @Override
    public List<Funcionario> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Carro a", Funcionario.class);

        List<Funcionario> funcionarios = q.getResultList();

        return funcionarios;
    }

    @Override
    public Funcionario findByName(String nome) {
        try {
            String consultaId = "from Funcionario where nome=" + nome;
            Query q = (Query) em.createQuery(consultaId);
            List<Funcionario> funcionariosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < funcionariosId.size(); i++) {
                if(funcionariosId.get(i).getNome() == nome) {
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
            Query q = (Query) em.createQuery(consultaId);
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

    @Override
    public void insertDados(Funcionario func) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(func);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void updateDados(Funcionario func) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteDados(Funcionario func) {
        try {
            Funcionario funcionarioDel = em.getReference(Funcionario.class, func.getId());
            tx.begin();
            em.remove(funcionarioDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
