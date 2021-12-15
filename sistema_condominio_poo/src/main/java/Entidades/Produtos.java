package Entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produtos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Fornecedor fornecedor;

    private int quantidadeMinima;
    private double preco;
    private String nome;
    private int quantidade;
    private Date dataEntrega;
    private Date dataSaida;

    Produtos(int i, int i0, Fornecedor f, int i1, String pentoprazol, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataEntrega(Date data) {
        this.dataEntrega = data;
    }

    public Date getDataEntrega() {
        return this.dataEntrega;
    }

    public void setDataSaida(Date data) {
        this.dataSaida = data;
    }

    public Date getDataSaida() {
        return this.dataSaida;
    }

    public Produtos(Fornecedor fornecedor, double preco, String nome) {
        this.fornecedor = fornecedor;
        this.preco = preco;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}