package condominio.poo;
import Entidades.*;
import processos.*;
import java.util.HashSet;
import java.util.Set;
//imports para o JPA
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App {
    public static void main(String[] args) {
        Endereco e = new Endereco("123", "bairro", "cidade", "estado", "pais", 666);
        Fornecedor f = new Fornecedor("telefone", "nome", e);
        Produtos p = new Produtos(f, 55.5, "ome");
        livroDiario l = new livroDiario(1);
        livroRazao lr = new livroRazao(1, 12, "Felipe Matheus", 10000);
                
        l.adicionarLista(p);
        System.out.println(l.getDate());
        l.listagem();
        
        System.out.println(e.numero);
        System.out.println(f.getTelefone());
        System.out.println(p.getPreco());
        
        l.calcularGastos(); 
        
        lr.adicionarAoHistorico(l);
        lr.setDespesa();
        lr.calcularSaldo();
       
        System.out.println("ver gastos \n" +l.verGastos()+"\n");
        System.out.println(lr.getSaldo() + "\n");
        System.out.println("despesa \n");
        System.out.println(lr.getDespesa());
        System.out.println("montante \n");        
        System.out.println(lr.getMontante());
        
        

        Funcionario func1 = new Funcionario("123456", "081123", "João");

        Almoxarifado almoxarifado = new Almoxarifado(func1, "027456", "almoraxifado@produtos.com");


        /**
         * Aqui temos um algoritmo basico para inserir dados em uma tabela
         */
        // try{
        //     System.out.println( "======================================" );
        //     EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        //     EntityManager em = emf.createEntityManager();

        //     Automovel auto = new Automovel();
        //     auto.setAno(2001);
        //     auto.setModelo("Ferrari");
        //     auto.setObservacao("quebrado");

        //     EntityTransaction tx = em.getTransaction();
        //     tx.begin();
        //     em.persist(auto);
        //     tx.commit();
        //     em.close();
        //     emf.close();
        //     System.out.println( "======================================" );
        // }catch (Exception e){
        //     System.out.println( "=====================================\n"+
        //     "Deu errado --> " + e);
        // }
    }
}
