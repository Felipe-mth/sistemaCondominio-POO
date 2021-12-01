package poo.sistema_condominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Endereco e= new  Endereco("123", "bairro", "cidade", "estado", "pais", 666);
        Fornecedor f = new Fornecedor("telefone", "nome", e);
        Produtos p = new Produtos(f, 55.5, "ome");
        livroDiário l = new livroDiário();
        l.setId(1);
        l.adicionarLista(p);

        l.Listagem();
        System.out.println(e.numero);
        System.out.println(f.getTelefone());
        System.out.println(p.getPreco());
    }
}
