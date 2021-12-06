package poo.sistema_condominio;

import processos.livroDiario;
import Entidades.Fornecedor;
import Entidades.Produtos;
import Entidades.Endereco;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class livroDiarioTest {
   Endereco e = new Endereco("Avenida pesqueira","Prado", "Pesqueira","Pernambuco", "Brazil", 12);
    Fornecedor f = new Fornecedor("87 995456023", "Felipe", e);
    Produtos p = new Produtos(f, 50, "savi", 16);
    livroDiario l = new livroDiario(1);
    
    @Test
    void testeMes(){
        assertTrue(l.getDate().getMonth()+1>0 || l.getDate().getMonth()+1<13, "esse mês é inválido");
        
    }
    @Test 
    void testegastos(){
        l.calcularGastos();
        assertTrue(l.verGastos()>= 0, "nao é possível se ter gastos negativos");
    }
}
