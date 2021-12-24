package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Estacionamento")
public class Estacionamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Carro carro;

    //@ManyToOne
    //public Apartamentos apartamentos;

    //public Morador morador;
    private int vaga;
    private boolean reserva;
    private int bloco;
    
    public Estacionamento(int id, Carro carro, int vaga, boolean reserva, int bloco) {
        this.id = id;
        this.carro = carro;
        this.vaga = vaga;
        this.reserva = reserva;
        this.bloco = bloco;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getVaga() {
        return this.vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public boolean getReserva() {
        return this.reserva;
    }


}
