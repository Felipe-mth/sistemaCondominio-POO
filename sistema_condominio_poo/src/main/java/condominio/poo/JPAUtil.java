package condominio.poo;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import javax.persistence.Query;


import Entidades.Carro;

public class JPAUtil {
        //criar a conexão com BD
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        //conexão com a unidade de persistência.
        public static EntityManager getEntityManager() {
            return emf.createEntityManager();
        }
        public static void closeEntityManager() {
            emf.close();
        }
        public static void consulta() {
            System.out.println("-----------CONSULTA--------------");
            EntityManager em = JPAUtil.getEntityManager();
            Query q = (Query) em.createQuery("select a from Carro a", Carro.class);

            List<Carro> autos = q.getResultList();
            for(Carro a : autos) {
            System.out.println(a.getModelo() +" --- "+a.getPlaca());
            }
        }
}
        

