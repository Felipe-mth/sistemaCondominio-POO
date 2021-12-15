package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Apartamentos")
public class Apartamentos {

    @Id //este 
    private int nApartamento; 

    @OneToMany
    public Estacionamento estacionamento;

    @OneToMany
    private Morador morador;

    private int andar;
    private int bloco;
    
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