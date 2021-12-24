package poo.sistema_condominio;
import Model.Apartamentos;
import Model.Carro;
import Model.Morador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//eu consigo estacionar meu carro?
public class ApartamentoTeste {
    Morador m = new Morador("123.123.123-12","9006587931","bio");
    Apartamentos a = new Apartamentos(m, 1, 1, 1);

    @Test
    @DisplayName("certo")
    public void apartamentoEstacionamento(){
        assertTrue(a.estacionamento.isReserva());
    }
}
