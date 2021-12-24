package Model;

//import processos.*;
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
   // @ManyToOne
   // private livroDiario livroDiario;
  //  @ManyToOne
  //  private Almoxarifado almoxarifado;
    
    private int quantidadeMinima;
    private double preco;
    private String nome;
    private int quantidade;
    private Date dataEntrega;
    private Date dataSaida;

    public Produtos(Fornecedor fornecedor, int quantidadeMinima, double preco, String nome, int quantidade) {
        this.fornecedor = fornecedor;
        this.quantidadeMinima = quantidadeMinima;
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
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
    /*public void setlivroDiario(livroDiario livro){
        this.livroDiario = livro;
    }
    public void setAlmoxarifado(Almoxarifado armazem){
        this.almoxarifado = armazem;
    }*/
}
