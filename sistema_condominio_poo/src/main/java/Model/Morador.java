package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "Morador")
public class Morador extends Pessoa {
    @ManyToOne
    private Apartamentos apartamento;

    public Morador(Apartamentos apartamento, String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        super(cpfCNPJ, telefone, nome, endereco);
        this.apartamento = apartamento;
    }

    public Apartamentos getApartamento() {
        return apartamento;
    }
    public void setApartamento(Apartamentos apartamento) {
        this.apartamento = apartamento;
    }
}
