package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int numero;

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

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

}
