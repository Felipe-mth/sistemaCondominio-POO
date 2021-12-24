package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Pessoa")
public class Pessoa {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String cpfCnpj;
    
    private Endereco endereco;
    private String telefone;
    private String nome;
    
    public Pessoa(String cpfCNPJ, String telefone, String nome, Endereco endereco){
        this.cpfCnpj = cpfCNPJ;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCNPJ) {
        this.cpfCnpj = cpfCNPJ;
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
