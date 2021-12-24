package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
public class Pessoa {

    @Id
    private String cpfCNPJ;
    
    private Endereco endereco;
    private String telefone;
    private String nome;
    
    public Pessoa(String cpfCNPJ, String telefone, String nome, Endereco endereco){
        this.cpfCNPJ = cpfCNPJ;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCNPJ;
    }

    public void setCpfCnpj(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
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
    
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
