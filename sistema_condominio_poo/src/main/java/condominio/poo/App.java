package condominio.poo;
//import Entidades.*;
//import processos.*;
//import java.util.HashSet;
//import java.util.Set;
//imports para o JPA
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Model.*;



public class App {
    public static void main(String[] args) {

        System.out.println( "Hello World!" );
       
        try{
            System.out.println( "======================================" );
          
            EntityManager em = JPAUtil.getEntityManager();

            //as funçoes do banco ai
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            tx.commit();

            em.close();
            System.out.println( "======================================" );

        }catch (Exception e){
            System.out.println( "=====================================\n"+
            "Deu errado --> " + e);
        }
        //parte 1
        //parte2
        
        /*
        Endereco e = new Endereco("123", "bairro", "cidade", "estado", "pais", 666);
        Funcionario func = new Funcionario("asdasd", e, "gestor", 456.7, "asd", "asdasd", "Jerso");
        */
    }
}



/*
//parte 1

       //Endereco e = new Endereco("123", "bairro", "cidade", "estado", "pais", 666);
        // Fornecedor f = new Fornecedor("telefone", "nome", e);
        // Produtos p = new Produtos(f, 55.5, "ome");
        // livroDiario l = new livroDiario(1);
        // livroRazao lr = new livroRazao(1, 12, "Felipe Matheus", 10000);
                
        // l.adicionarLista(p);
        // System.out.println(l.getDate());
        // l.listagem();
        
        // System.out.println(e.numero);
        // System.out.println(f.getTelefone());
        // System.out.println(p.getPreco());
        
        // l.calcularGastos(); 
        
        // lr.adicionarAoHistorico(l);
        // lr.setDespesa();
        // lr.calcularSaldo();
       
        // System.out.println("ver gastos \n" +l.verGastos()+"\n");
        // System.out.println(lr.getSaldo() + "\n");
        // System.out.println("despesa \n");
        // System.out.println(lr.getDespesa());
        // System.out.println("montante \n");        
        // System.out.println(lr.getMontante());
        

        // Funcionario func1 = new Funcionario("123456", "081123", "João");

        // Almoxarifado almoxarifado = new Almoxarifado(func1, "027456", "almoraxifado@produtos.com");

*/

/*
//parte2
        
        /**
         * Aqui temos um algoritmo basico para inserir dados em uma tabela
         */
        /*
        try{
            System.out.println( "======================================" );
            Carro carro = new Carro("AWQQB","ocupada","ferarri");
            // Carro carro = new Carro();
            // carro.setModelo("ferarri");
            // carro.setPlaca("AAABBB");
            // carro.setVaga("ocupada");
            EntityManager em = JPAUtil.getEntityManager();
  
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(carro);
            tx.commit();
            em.close();
            
            System.out.println( "======================================" );
        }catch (Exception error){
            System.out.println( "=====================================\n"+
            "Deu errado --> " + error);
        }
        try{
           JPAUtil.consulta(); 
        }catch (Exception error){
            System.out.println( "=====================================\n"+
            "Deu errado a consulta --> " + error);
        }
*/
