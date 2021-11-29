package poo.sistema_condominio;

import java.util.Date;

public class Produtos {
    
    private int id;
    private int quantidadeMinima;
    private Fornecedor fornecedor;
    private double preco;
    private String nome;
    private int quantidade;
    private Date dataEntrega;
    private Date dataSaida;

    public Produtos(Fornecedor fornecedor, double preco,String nome) {
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
