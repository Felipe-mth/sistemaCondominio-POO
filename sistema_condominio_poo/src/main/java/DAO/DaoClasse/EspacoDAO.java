package DAO.DaoClasse;
import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Espaco;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import condominio.poo.JPAUtil;

public class EspacoDAO implements crudDAO<Espaco>{
    
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Espaco> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Espaco a", Espaco.class);
        @SuppressWarnings("unchecked")
        List<Espaco> listaDeEspacos = q.getResultList();

        return listaDeEspacos;
    }

    @Override
    public Espaco findByName(String nome) {
        return null;
    }

    public Espaco findById(int id) {
        try {
            String consultaId = "from Espaco where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Espaco> espacoId = q.getResultList();
            int index = -1;

            for(int i = 0; i < espacoId.size(); i++) {
                if(espacoId.get(i).getId() == id) {
                    index = i;
                }
            }
            return espacoId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Espaco espaco) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(espaco);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
    }

    @Override
    public void updateDados(Espaco espaco) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.merge(espaco);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
        
    }

    @Override
    public void deleteDados(Espaco espaco) {
        try {
            Espaco espacoDel = em.getReference(Espaco.class, espaco.getId());
            tx.begin();
            em.remove(espacoDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
