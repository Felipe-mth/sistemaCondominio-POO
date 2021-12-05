package Entidades;

public class Fornecedor {
    private Integer id;
    private String telefone;
    private String nome;
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
