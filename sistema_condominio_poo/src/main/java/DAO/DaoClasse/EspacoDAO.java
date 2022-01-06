package DAO.DaoClasse;
import java.util.Date;
import java.util.List;

import DAO.interfaces.crudDAO;
import Model.Espaco;
import javax.persistence.Query;

import Model.Morador;
import conexaoBancoDeDados.JPAUtil;

public class EspacoDAO {
    JPAUtil connection = new JPAUtil();

    public List<Espaco> findAll() {
        System.out.println("-----------CONSULTA--------------");
        Query q = connection.em.createQuery("select a from Espaco a", Espaco.class);
        @SuppressWarnings("unchecked")
        List<Espaco> listaDeEspacos = q.getResultList();

        return listaDeEspacos;
    }

    public Espaco findByName(String nome) {
        return null;
    }

    public Espaco findById(int id) {
        try {
            String consultaId = "from Espaco where id=" + id;
            Query q = connection.em.createQuery(consultaId);
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

    public void insertDados(Date data, Morador morador) {
        try {
            System.out.println("======================================");
            Espaco espaco = new Espaco(data, morador);
            connection.tx.begin();
            connection.em.persist(espaco);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
    }

    public void updateDados(Espaco espaco) {
        try {
            System.out.println("======================================");

            connection.tx.begin();
            connection.em.merge(espaco);
            connection.tx.commit();
            connection.em.close();

            System.out.println("======================================");
        } catch (Exception error) {
            System.out.println("=====================================\n" +
                    "Deu errado --> " + error);
        } 
        
    }

    public void deleteDados(Espaco espaco) {
        try {
            Espaco espacoDel = connection.em.getReference(Espaco.class, espaco.getId());
            connection.tx.begin();
            connection.em.remove(espacoDel);
            connection.tx.commit();
        } catch (Exception e) {
            System.out.println("------>" + e);
        }
        
    }
    
}
