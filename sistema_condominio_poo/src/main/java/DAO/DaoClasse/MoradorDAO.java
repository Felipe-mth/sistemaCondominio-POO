package DAO.DaoClasse;

import java.util.List;

import javax.persistence.Query;

import conexaoBancoDeDados.JPAUtil;

import Model.*;

public class MoradorDAO {
    JPAUtil connection = new JPAUtil();

    public List<Morador> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Morador a", Morador.class);
        @SuppressWarnings("unchecked")
        List<Morador> moradores = q.getResultList();

        return moradores;
    }

    public Morador findByName(String nome) {
        try {
            String consultaId = "from Morador where nome=" + nome;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Morador> moradoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < moradoresId.size(); i++) {
                if(moradoresId.get(i).getNome().equals(nome)) {
                    index = i;
                }
            }

            return moradoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public Morador findById(int id) {
        try {
            String consultaId = "from Morador where id=" + id;
            Query q = connection.em.createQuery(consultaId);
            @SuppressWarnings("unchecked")
            List<Morador> moradoresId = q.getResultList();
            int index = -1;

            for(int i = 0; i < moradoresId.size(); i++) {
                if(moradoresId.get(i).getId() == id) {
                    index = i;
                }
            }
            return moradoresId.get(index);
        } catch (Exception e) {
            System.out.println("------>" + e);
            return null;
        }
    }

    public void insertDados(Apartamentos apartamento, String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        try {
            System.out.println("======================================");
            Morador mora = new Morador(apartamento, cpfCNPJ, telefone, nome, endereco);
            connection.tx.begin();
            connection.em.persist(mora);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void updateDados(Morador morador) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(morador);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        }
    }

    public void deleteDados(Morador morador) {
        try {
            Morador moradorDel = connection.em.getReference(Morador.class, morador.getId());
            connection.tx.begin();
            connection.em.remove(moradorDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
    } 
}   
