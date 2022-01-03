package conexaoBancoDeDados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPAUtil {
        //criar a conexão com BD
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        public EntityManager em = emf.createEntityManager();
        public EntityTransaction tx = em.getTransaction();
}
        

