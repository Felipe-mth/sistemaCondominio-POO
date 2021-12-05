package Entidades;


public class Morador extends Pessoa {

    //private int id;
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
