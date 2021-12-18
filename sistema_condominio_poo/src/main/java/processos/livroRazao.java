
package processos;

import java.util.ArrayList;

//import java.util.Date;//n esta sendo usado nessa class todas as chamadas ja são retiradas das outras classes
//import java.util.Calendar; //caso queira usar calendario

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livroRazao")
public class livroRazao{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private int mes;
    private String criadoPor;
    private String modificadoPor;
    private double despesa;
    private double saldo;
    private final double montante;
    ArrayList<livroDiario> livrosDiarios = new ArrayList<>();   // coloquei apenas o <>, na declaração do new arraylist.
    
    public livroRazao(int id, int mes,String criadoPor, double montante){
        this.Id = id;
        this.mes = mes;
        this.criadoPor = criadoPor;
        this.montante = montante;
    }
    
    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return this.Id;
    }

    public void setmes(int mes) {
        if(mes>=1 && mes<=12){
            this.mes = mes;
        }
        else{
         System.out.println("Insira um mes valido");
        }
    }

    public String getmes() {
        String month = "";
        switch(this.mes){
        case 1 : month = "janeiro"; break;
        case 2 : month = "fevereiro"; break;
        case 3 : month = "março"; break;
        case 4 : month = "abril"; break;
        case 5: month = "maio"; break;
        case 6 : month = "junho"; break;
        case 7 : month = "julho"; break;
        case 8 : month = "agosto"; break;
        case 9 : month = "setembro"; break;
        case 10 : month = "outubro"; break;
        case 11 : month = "novembro"; break;
        case 12 : month = "dezembro"; break;
        }
           return month;
    }

    public void setCriadoPor(String pessoa) {
        this.criadoPor = pessoa;
    }

    public String getCriadoPor() {
        return this.criadoPor;
    }

    public void setModificadoPor(String pessoa) {
        this.modificadoPor = pessoa;
    }

    public String getModificadoPor() {
        return this.modificadoPor;
    }

    public void adicionarAoHistorico(livroDiario livroDiario) {
        int valor = livroDiario.getDate().getMonth() + 1; // o +1 é pq ele identifica janeiro como 0 e n como 1
        // esse erro em getMonth() é apenas informando que essa função esta ultrapadsada, pois existe a biblioteca Calendario no momento.

        if(valor == this.mes){
            livrosDiarios.add((livroDiario) livroDiario);
        }
        else{
            System.out.println("Os meses são incompativeis");
        }
    }

    public void verHistorico() {
        for (int i = 0; i < livrosDiarios.size(); i++) {
            livrosDiarios.get(i).getId();
            livrosDiarios.get(i).getData();
            livrosDiarios.get(i).listagem();
        }
    }

    public void setDespesa() {
        for (int i = 0; i < livrosDiarios.size(); i++) {
            this.despesa += livrosDiarios.get(i).verGastos();
        }
    }
    public double getDespesa(){
        return this.despesa;
    }
    public double getMontante(){
        return this.montante;
    }
    public void calcularSaldo(){
        this.saldo = this.montante - this.despesa;
    }
    
    public double getSaldo(){
        if(this.saldo> 0){
            System.out.println("O balanço do mes foi positivo \n");
        }
        else if(this.saldo == 0){
            System.out.println("O balanço do mes foi neutro \n");
        }
        else{
           System.out.println("O balanço do mes foi negativo \n");
        }
        
        return this.saldo;
    }
}
