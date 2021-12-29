package processos;

import Model.Produtos;
import Model.Transacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "livrodiario")
public class livroDiario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();              // modificar se for para usar o calendar
    private String data;                         // same
    private double valorEntrada;
    private double valorSaida;
    
    @ManyToOne
    private livroRazao livroRazao;

    @Transient
    SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    @OneToMany
    ArrayList<Transacao> transacoesEntrada = new ArrayList<>();  //aqui so tava faltando o <>, no new arraylist.

    @OneToMany
    ArrayList<Transacao> transacoesSaida = new ArrayList<>();

    public SimpleDateFormat getFormatador() {
        return formatador;
    }

    public livroDiario(){}
   
    public livroDiario(int Id){
      this.Id = Id;
      this.data = formatador.format(date);
    }
    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return this.Id;
    }
    public Date getDate(){
        return this.date;
    }
    public void setData() {
        
        this.data = formatador.format(date);
    }

    public ArrayList<Transacao> getTransacoesEntrada() {
        return transacoesEntrada;
    }

    public void addTransacoesEntrada(Transacao transacoesEntrada) {
        this.transacoesEntrada.add(transacoesEntrada);
        this.valorEntrada += transacoesEntrada.getValor();
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public ArrayList<Transacao> getTransacoesSaida() {
        return transacoesSaida;
    }

    public void addTransacoesSaida(Transacao transacoesSaida) {
        this.transacoesSaida.add(transacoesSaida);
        this.valorSaida += transacoesSaida.getValor();
    }

    public String getData() {
        return this.data;
    }
    
    public double verSaldo() {
        return this.valorEntrada - this.valorSaida;
    }

    
    public void livro(livroRazao livro){
        this.livroRazao = livro;
    }
    
    /*public void setGastosProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            this.gastoDeProduto = this.gastoDeProduto + produtos.get(i).getPreco();
        }
    }

    public void adicionarLista(Object produto) {
        produtos.add((Produtos) produto);
    }*/
}
