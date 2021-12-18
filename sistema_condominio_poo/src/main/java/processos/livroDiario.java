package processos;

import Entidades.Produtos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "livrodiario")
public class livroDiario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Date date = new Date();              // modificar se for para usar o calendar
    private String data;                         // same
    private double gastoDeProduto;
    
    @ManyToOne
    private livroRazao livroRazao;
    SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    ArrayList<Produtos> produtos = new ArrayList<>();  //aqui so tava faltando o <>, no new arraylist.
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

    public String getData() {
        return this.data;
    }

    public void adicionarLista(Object produto) {
        produtos.add((Produtos) produto);
    }

    public void listagem() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getId());
            System.out.println(produtos.get(i).getNome());
            System.out.println(produtos.get(i).getDataEntrega());
            System.out.println(produtos.get(i).getDataSaida());
            System.out.println(produtos.get(i).getFornecedor().getNome());
            System.out.println(produtos.get(i).getPreco());
            System.out.println(produtos.get(i).getQuantidade());
            System.out.println(produtos.get(i).getQuantidadeMinima());
        }
    }

    public void calcularGastos() {
        for (int i = 0; i < produtos.size(); i++) {
            this.gastoDeProduto = this.gastoDeProduto + produtos.get(i).getPreco();
            System.out.println(this.gastoDeProduto);
            System.out.println(produtos.get(i).getPreco());
        }
    }

    public double verGastos() {
        return this.gastoDeProduto;
    }
    
    public void livro(livroRazao livro){
        this.livroRazao = livro;
    }

}
