package Entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Morador")
public class Morador extends Pessoa {

    @OneToOne
    private Pessoa pessoa;

    @ManyToMany
    public Carro carro;

    //private int id;
    

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
