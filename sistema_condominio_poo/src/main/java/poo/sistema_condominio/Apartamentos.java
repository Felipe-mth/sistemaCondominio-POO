package poo.sistema_condominio;

public class Apartamentos {
    private int nApartamento; 
    private int andar;
    private int bloco;
    private Estacionamento estacionamento;
    private Morador morador;
    
    public Apartamentos(Morador morador) {
        this.morador = morador;
    }
    
}
