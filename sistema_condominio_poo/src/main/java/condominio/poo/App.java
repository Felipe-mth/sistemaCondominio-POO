package condominio.poo;
import Entidades.*;
import processos.*;
import java.util.HashSet;
import java.util.Set;

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
    }
}
