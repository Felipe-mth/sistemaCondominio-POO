package Entidades;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
=======
import javax.persistence.Id;
import javax.persistence.ManyToMany;
>>>>>>> 222eee8f0019a49ef63e12b5a2ff0a1c457773f7
import javax.persistence.Table;

@Entity
@Table(name = "Carro")
public class Carro {
<<<<<<< HEAD
    @Id 
    private String placa; //pode ser uma pk;
    @GeneratedValue
=======
    
    @Id
    private String placa; //pode ser uma pk;

    @ManyToMany
    private Morador morador;
    
>>>>>>> 222eee8f0019a49ef63e12b5a2ff0a1c457773f7
    private String vaga;
    private String modelo;

    public Carro(){}

    public Carro(String placa, String vaga, String modelo) {
        this.placa = placa;
        this.vaga = vaga;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
