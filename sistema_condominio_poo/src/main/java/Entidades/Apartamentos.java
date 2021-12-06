package Entidades;

public class Apartamentos {
    private int nApartamento; 
    private int andar;
    private int bloco;
    public Estacionamento estacionamento;
    private Morador morador;
    
    public Apartamentos(Morador morador, int nApartamento, int andar, int bloco) {
        this.morador = morador;
        this.nApartamento = nApartamento;
        this.andar = andar;
        this.bloco =  bloco;
        estacionar(this.morador);
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Estacionamento getEstacionamento(){
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
    }

    public  int getnApartamento(){
        return nApartamento;
    }

    public void setnApartamento(int nApartamento){
        this.nApartamento = nApartamento;
    }

    public int getBloco(){
        return bloco;
    }

    public void setBloco(int bloco){
        this.bloco = bloco;
    }
    
    public int getAndar(){
        return andar;
    }

    public void setAndar(int andar){
        this.andar = andar;
    }
    
    public void estacionar(Morador morador){
        this.estacionamento = new Estacionamento(morador);
        estacionamento.setReserva(true);
    }
}