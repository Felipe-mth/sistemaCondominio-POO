package poo.sistema_condominio;


import Model.Carro;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarroTest{
    Carro c = new Carro("ABCD032", "A1", "Toyota prius");
    @Test
    void validarPlaca(){
        assertEquals(7, c.getPlaca().length());
    }
    @Test
    void validarVaga(){
        assertEquals(2, c.getVaga().length());
    }
}