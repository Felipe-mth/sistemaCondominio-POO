package Model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "Fornecedor")
public class Fornecedor extends Pessoa {
    /*
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    */
    /*
    @OneToOne
    private Endereco endereco;
    */

    public Fornecedor(String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        super(cpfCNPJ, telefone, nome, endereco);
    }
}
