package poo.sistema_condominio;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Endereco e= new  Endereco("123", "bairro", "cidade", "estado", "pais", 666);
        Fornecedor f = new Fornecedor("telefone", "nome", e);
        Produtos p = new Produtos(f, 55.5, "ome");
        System.out.println(e.numero);
        System.out.println(f.getTelefone());
        System.out.println(p.getPreco());
    }
}
