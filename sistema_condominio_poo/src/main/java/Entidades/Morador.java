package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Morador")
public class Morador{

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Pessoa pessoa;

    @ManyToOne
    private Apartamentos apartamentos;

    //@ManyToMany
    //public Carro carro;

   // public Morador(String cpf, String telefone, String nome) {
     //   super(cpf, telefone, nome);   
    //}
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Apartamentos getApartamentos() {
        return apartamentos;
    }
    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }


   // public void getDadosCarro(){

    //}

    //metodo responsavel por instaciar a variavel carro
    //public void setCarro(Carro c){
      //  this.carro = new Carro(c.getModelo(),c.getPlaca(),c.getVaga());
    //}

    
}
