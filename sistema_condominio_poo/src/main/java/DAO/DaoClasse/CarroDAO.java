package DAO.DaoClasse;

import java.util.List;

import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;
import DAO.interfaces.*;
import Model.*;

public class CarroDAO {
    JPAUtil connection = new JPAUtil();

    public List<Carro> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Carro a", Carro.class);
        @SuppressWarnings("unchecked")
        List<Carro> autos = q.getResultList();

        return autos;
    }

    public Carro findById(String id) {
        try {
            String consultaId = "from Carro where placa=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Carro> carroId = q.getResultList();
            int index = -1;

            for(int i = 0; i < carroId.size(); i++) {
                if(carroId.get(i).getPlaca() == id) {
                    index = i;
                }
            }

            return carroId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Carro findByName(String nome) {
        try {
            String consultaId = "from Carro where modelo=" + nome;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Carro> carroNome = q.getResultList();
            
            int index = -1;

            for(int i = 0; i < carroNome.size(); i++) {
                if(carroNome.get(i).getModelo().equals(nome)) {
                    index = i;
                }
            }

            return carroNome.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(String placa, String modelo, Morador dono) {
        try {
            System.out.println("======================================");
            Carro carro = new Carro(placa, modelo, dono);
            connection.tx.begin();
            connection.em.persist(carro);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(Carro carro) {
        try {
            Carro carroDel = connection.em.getReference(Carro.class, carro.getPlaca());
            connection.tx.begin();
            connection.em.remove(carroDel);
            connection.tx.commit();

        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    }

    public void updateDados(Carro carro) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(carro);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

}
