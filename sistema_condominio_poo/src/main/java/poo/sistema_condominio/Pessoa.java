package poo.sistema_condominio;

public class Pessoa {
    private int  ID;//verificar esse aqui ja que o cpf pode ser um identificador
    private String CPF;
    private String telefone;
    private String nome;
    
    public Pessoa(String cpf, String telefone, String nome){
        this.CPF = cpf;
        this.telefone = telefone;
        this.nome = nome;
        //this.ID = id;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
