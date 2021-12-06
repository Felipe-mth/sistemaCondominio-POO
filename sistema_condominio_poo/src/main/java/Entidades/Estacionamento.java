package Entidades;

public class Estacionamento {
    private int id;
    public Morador morador;
    private boolean reserva;
    private int bloco;
    private Carro carro;
   

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
