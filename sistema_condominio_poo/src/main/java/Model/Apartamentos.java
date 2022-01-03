package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Apartamentos")
public class Apartamentos {

    @Id //este 
    private int numeroDoApartamento;
    private int andar;
    private int bloco;

    public Apartamentos() {
    }

    public Apartamentos(int numeroDoApartamento, int andar, int bloco) {
        this.numeroDoApartamento = numeroDoApartamento;
        this.andar = andar;
        this.bloco =  bloco;
    }

    public  int getnumeroDoApartamento(){
        return numeroDoApartamento;
    }

    public void setnumeroDoApartamento(int numeroDoApartamento){
        this.numeroDoApartamento = numeroDoApartamento;
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
}