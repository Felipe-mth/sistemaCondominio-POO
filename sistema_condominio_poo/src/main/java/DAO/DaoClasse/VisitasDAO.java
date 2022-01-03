package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Visitas;
import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;

public class VisitasDAO implements crudDAO<Visitas>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<Visitas> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Produtos a", Visitas.class);
        @SuppressWarnings("unchecked")
        List<Visitas> visitantes = q.getResultList();

        return visitantes;
    }

    @Override
    public Visitas findByName(String nome) {
        try {
            String consultaId = "from Visitas where nome=" + nome;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Visitas> visitasName = q.getResultList();
            int index = -1;

            for(int i = 0; i < visitasName.size(); i++) {
                if(visitasName.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return visitasName.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Visitas findById(int id) {
        try {
            String consultaId = "from Visitas where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Visitas> visitasId = q.getResultList();
            int index = -1;

            for(int i = 0; i < visitasId.size(); i++) {
                if(visitasId.get(i).getId() == id) {
                    index = i;
                }
            }
            return visitasId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Visitas visitas) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.persist(visitas);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
    }

    @Override
    public void updateDados(Visitas visitas) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(visitas);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
        
    }

    @Override
    public void deleteDados(Visitas visitas) {
        try {
            Visitas visitasDel = connection.em.getReference(Visitas.class, visitas.getId());
            connection.tx.begin();
            connection.em.remove(visitasDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
