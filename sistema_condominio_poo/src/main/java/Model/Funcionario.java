package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario extends Pessoa {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /*
    @OneToOne
    private Endereco endereco;
    
    @OneToOne
    private Pessoa pessoa;
    */
    private String cargo;
    private double salario;
    private String turno;

    public Funcionario(String cpf, Endereco endereco, String cargo, double salario, String turno, String telefone, String nome) {
        super(cpf, telefone, nome, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
