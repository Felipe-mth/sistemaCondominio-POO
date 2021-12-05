package Entidades;

public class Endereco {
    
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    public int    numero;
    

    public Endereco(String rua, String bairro, String cidade, String estado, String pais, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
    }

}
