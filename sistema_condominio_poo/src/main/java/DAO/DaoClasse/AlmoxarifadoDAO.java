package DAO.DaoClasse;

import DAO.interfaces.crudDAO;
import Model.Almoxarifado;
import condominio.poo.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class AlmoxarifadoDAO implements crudDAO<Almoxarifado> {
    public EntityManager em = JPAUtil.getEntityManager();
    public EntityTransaction tx = em.getTransaction();

    @Override
    public List<Almoxarifado> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = (Query) em.createQuery("select a from Almoxarifado a", Almoxarifado.class);
        @SuppressWarnings("unchecked")
        List<Almoxarifado> almoxarifado = q.getResultList();

        return almoxarifado;
    }

    public Almoxarifado findById(int id) {
        try {
            String consultaId = "from Almoxarifado where id=" + id;
            Query q = (Query) em.createQuery(consultaId);
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

    @Override
    public void insertDados(Almoxarifado almoxarifado) {
        try {
            System.out.println("======================================");

            tx.begin();
            em.persist(almoxarifado);
            tx.commit();
            em.close();

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

            tx.begin();
            em.merge(almoxarifado);
            tx.commit();
            em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Almoxarifado almoxarifado) {
        try {
            Almoxarifado almoxarifadoDel = em.getReference(Almoxarifado.class, almoxarifado.getId());
            tx.begin();
            em.remove(almoxarifadoDel);
            tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
