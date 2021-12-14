package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//@Entity
public class Funcionario extends Pessoa  {
  //  @GeneratedValue
    private String cargo;
    private double salario;
    private String turno;
    
    public Funcionario(String cpf, String telefone, String nome) {
        super(cpf, telefone, nome);
    }

    //metodos acessores
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
