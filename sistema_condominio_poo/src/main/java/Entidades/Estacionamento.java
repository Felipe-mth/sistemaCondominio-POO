package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Estacionamento")
public class Estacionamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Carro carro;

    @OneToMany
    public Morador morador;
    
    private boolean reserva;
    private int bloco;
    
   

    public Estacionamento(Morador morador){
        this.morador = morador;
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


}
