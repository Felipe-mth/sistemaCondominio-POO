package poo.sistema_condominio;

import java.util.ArrayList;
import java.util.Date;

public class livroDiário {
    private int Id;
    private Date data;
    private double gastoDeProduto;
    ArrayList<Produtos> produtos = new ArrayList();
    
    public void setId(int id){
        this.Id = id;
    }
    public int getId(){
        return this.Id;
    }
    public void setData(Date data){
        
        this.data = data;
    }
    public Date getData(){
       return this.data;
    }
   public void adicionarLista(Object produto){
       produtos.add((Produtos) produto);
   }
   public void  Listagem(){
      for(int i = 0; i< produtos.size(); i++){
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
   public void calcularGastos(){
       this.gastoDeProduto = 0;
      for(int i = 0; i< produtos.size(); i++){
          this.gastoDeProduto += produtos.get(i).getPreco();
      } 
   }
   public double verGastos(){
    return this.gastoDeProduto;   
   }

   
}
