package Entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Funcionario e Morador serão uma unica tabela de pessoa sendo indentificada pelo  DiscriminatorValue(value = "")
 */
@Entity
@DiscriminatorValue(value = "M")
public class Morador extends Pessoa {

    // @OneToOne
    // private Pessoa pessoa;
    // @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;

    @ManyToMany
    public Carro carro;

    

    public Morador(String cpf, String telefone, String nome) {
        super(cpf, telefone, nome);
        
    }
    
    public void getDadosCarro(){

    }

    //metodo responsavel por instaciar a variavel carro
    public void setCarro(Carro c){
        this.carro = new Carro(c.getModelo(),c.getPlaca(),c.getVaga());
    }

    
}
