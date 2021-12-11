package Entidades;

public class Carro {
   
    private String placa; //pode ser uma pk;
    private String vaga;
    private String modelo;

    public Carro(String placa, String vaga, String modelo) {
        this.placa = placa;
        this.vaga = vaga;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
