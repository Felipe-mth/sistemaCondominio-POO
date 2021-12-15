package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id 
    private int   id;
    @GeneratedValue
    public int     numero;

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    
    public Endereco(String rua, String bairro, String cidade, String estado, String pais, int numero) {
        this.rua    = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais   = pais;
        this.numero = numero;
    }

}
