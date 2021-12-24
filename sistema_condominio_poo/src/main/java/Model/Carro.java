package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Carro")
public class Carro {
    
    @Id
    private String placa;

    @ManyToOne                      //ainda n
    private Morador dono;

    private String modelo;

    public Carro(String placa, String modelo, Morador dono) {
        this.placa = placa;
        this.modelo = modelo;
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Morador getDono() {
        return dono;
    }
    public void setDono(Morador dono) {
        this.dono = dono;
    }
}
