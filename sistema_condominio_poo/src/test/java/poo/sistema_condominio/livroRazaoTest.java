
package poo.sistema_condominio;
import processos.livroDiario;
import processos.livroRazao;
import Model.Fornecedor;
import Model.Produtos;
import Model.Endereco;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class livroRazaoTest {
    Endereco e = new Endereco("Avenida pesqueira","Prado", "Pesqueira","Pernambuco", "Brazil", 12);
    Fornecedor f = new Fornecedor("87 995456023", "Felipe", e);
    Produtos p = new Produtos(f, 50, "savi", 16);
    livroDiario l = new livroDiario(1);
    livroRazao lr = new livroRazao(1, 12, "Felipe", 100);
    
    @Test
    void testemes(){
        assertTrue(lr.getMonth()>0 && lr.getMonth()<13, "valor de mes invalido");
    }
    @Test
    void nomeValido(){
        assertTrue(!"".equals(lr.getCriadoPor()), "Por favor insira um nome");
        assertTrue(!" ".equals(lr.getCriadoPor()), "Por favor insira um nome valido");
    }  
    
    @Test
    void nomeValidoM(){
        assertTrue(!"".equals(lr.getModificadoPor()), "Por favor insira um nome");
        assertTrue(!" ".equals(lr.getModificadoPor()), "Por favor insira um nome valido");
    }
    @Test
    void verificarDespesas(){
        lr.adicionarAoHistorico(l);
        lr.setDespesa();
        assertTrue(lr.getDespesa()>=0, "Valor invalido para despesa");
    }
 
}
