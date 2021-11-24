package poo.sistema_condominio;


public class Morador extends Pessoa {

    //private int id;
    private Carro carro;

    public Morador(String cpf, String telefone, String nome) {
        super(cpf, telefone, nome);
        
    }
    
    public void getDadosCarro(){

    }

    //metodo responsavel por instaciar a variavel carro
    public void setCarro(){
        //this.carro = new Carro("a","c","d");
    }

    
}
