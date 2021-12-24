
package poo.sistema_condominio;

import Model.Produtos;
import Model.Fornecedor;
import Model.Endereco;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ProdutosTest {
    Endereco e = new Endereco("Avenida pesqueira","Prado", "Pesqueira","Pernambuco", "Brazil", 12);
    Fornecedor f = new Fornecedor("87 995456023", "Felipe", e);
    Produtos p = new Produtos(f, 50, "savi", 16);
    
    @Test
    void possuiFornecedor(){
        assertNotNull(f, "E preciso um fornecedor para o produto");
        
    }
    @Test
    void precoValido(){
        assertTrue(p.getPreco()>= 0, "Preco negativos não devem ser adicionados");
    }
    @Test
    void nomeValido(){
        assertTrue(!"".equals(p.getNome()), "Por favor insira um nome");
        assertTrue(!" ".equals(p.getNome()), "Por favor insira um nome valido");
    }  
    @Test
    void validarReserva() throws ParseException{
        Date data = new Date();
        String sDate1="31/12/2021";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        p.setDataEntrega(data);
        p.setDataSaida(date1);
        assertTrue(data.before(date1) || data.equals(date1), "a data de saida não pode ser menor que a entrega");
    }
    @Test
    void validarQuantidades(){
        p.setQuantidade(15);
        p.setQuantidadeMinima(5);
        
        assertTrue(p.getQuantidade()>0,"adicione uma quantidade valida");
        assertTrue(p.getQuantidadeMinima()>0,"adicione uma quantidade minima valida");
    }
}
