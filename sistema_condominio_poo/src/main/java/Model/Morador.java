package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Morador")
public class Morador extends Pessoa {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*
    @OneToOne
    private Pessoa pessoa;
    */
    
    @ManyToOne
    private Apartamentos apartamento;

    //@ManyToMany
    //public Carro carro;


    public Morador(Apartamentos apartamento, String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        super(cpfCNPJ, telefone, nome, endereco);
        this.apartamento = apartamento;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Apartamentos getApartamento() {
        return apartamento;
    }
    public void setApartamento(Apartamentos apartamento) {
        this.apartamento = apartamento;
    }
}
