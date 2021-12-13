package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EnderecoID;
    
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    public  int    numero;
    

    public Endereco(String rua, String bairro, String cidade, String estado, String pais, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
    }

}
