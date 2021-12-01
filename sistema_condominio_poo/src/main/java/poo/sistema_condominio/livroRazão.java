
package poo.sistema_condominio;

import java.util.ArrayList;


public class livroRazão {
    private int Id;
    private String log;
    private String mes;
    private String criadoPor;
    private String modificadoPor;
    private double despesa;
    private double saldo;
    private double montante;
    ArrayList<livroDiário> livrosDiarios = new ArrayList();
    
    public void setId(int id){
        this.Id = id;
    }
    
    public int getId(){
        return this.Id;
    }
    
    public void setmes(String mes){
        this.mes = mes;
    }
    
    public String getmes(){
        return this.mes;
    }
    
     public void setCriadoPor(String pessoa){
        this.criadoPor = pessoa;
    }
     
    public String getCriadoPor(){
        return this.criadoPor;
    }
    
     public void setModificadoPor(String pessoa){
        this.modificadoPor = pessoa;
    }
     
    public String getModificadoPor(){
        return this.modificadoPor;
    }
    
    public void adicionarAoHistorico(Object livroDiario){
        livrosDiarios.add((livroDiário) livroDiario);
    }
    public void verHistorico(){
        for(int i = 0; i<livrosDiarios.size(); i++){
            livrosDiarios.get(i).getId();
            livrosDiarios.get(i).getData();
            livrosDiarios.get(i).Listagem();
        }
    }
    public void setDespesa(){
        
        for(int i = 0; i<livrosDiarios.size(); i++){
            this.despesa +=  livrosDiarios.get(i).verGastos();
        }
    }

}
