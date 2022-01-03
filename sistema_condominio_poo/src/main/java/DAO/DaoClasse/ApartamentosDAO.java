package DAO.DaoClasse;

import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Apartamentos;

import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;

public class ApartamentosDAO implements crudDAO<Apartamentos>{
    JPAUtil connection = new JPAUtil();

    @Override
    public List<Apartamentos> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q =  connection.em.createQuery("select a from Apartamentos a", Apartamentos.class);
        @SuppressWarnings("unchecked")
        List<Apartamentos> apartamentos = q.getResultList();

        return apartamentos;
    }

    @Override
    public Apartamentos findByName(String nome) {
        return null;
    }

    public Apartamentos findById(int id) {
        try {
            String consultaId = "from Apartamentos where id=" + id;
            Query q =  connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Apartamentos> apartamentosId = q.getResultList();
            int index = -1;

            for(int i = 0; i < apartamentosId.size(); i++) {
                if(apartamentosId.get(i).getnumeroDoApartamento() == id) {
                    index = i;
                }
            }
            return apartamentosId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    @Override
    public void insertDados(Apartamentos apart) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.persist(apart);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }  
    }

    @Override
    public void updateDados(Apartamentos apart) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(apart);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    @Override
    public void deleteDados(Apartamentos apart) {
        try {
            Apartamentos apartamentoDel = connection.em.getReference(Apartamentos.class, apart.getnumeroDoApartamento());
            connection.tx.begin();
            connection.em.remove(apartamentoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }
}
