package Model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "Funcionario")
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String turno;

    public Funcionario(String cpf, Endereco endereco, String cargo, double salario, String turno, String telefone, String nome) {
        super(cpf, telefone, nome, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
    }

    public Funcionario() {

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
