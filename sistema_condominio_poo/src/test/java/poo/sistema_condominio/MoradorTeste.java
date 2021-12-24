package poo.sistema_condominio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Model.Carro;
import Model.Morador;


public class MoradorTeste {
    // - eu consigo criar um carro para morador?
    // - apos criar um carro eu consigo pegar as informações dele?

    Morador m = new Morador("123.123.123-12","9006587931","bio");
    Carro c = new Carro("ABCD032", "A1", "Toyota prius");

    @Test
    @DisplayName("Morador-Carro")
    public void moradorAcessaSeuCarro(){
        
        assertEquals("ABCD032", m.carro.getPlaca());
        assertEquals("A1", m.carro.getVaga());
        assertEquals("Toyota prius", m.carro.getModelo());
       
        
    }
}
