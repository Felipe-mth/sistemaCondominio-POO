package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Fornecedor")
public class Fornecedor extends Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /*
    @OneToOne
    private Endereco endereco;
    */

    public Fornecedor(String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        super(cpfCNPJ, telefone, nome, endereco);
    }

    // metodos acessores

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
