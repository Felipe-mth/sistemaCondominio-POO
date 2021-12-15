package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Fornecedor")
public class Fornecedor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String telefone;
    private String nome;

    @OneToOne
    private Endereco endereco;

    public Fornecedor(String telefone, String nome, Endereco endereco) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    // metodos acessores

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
