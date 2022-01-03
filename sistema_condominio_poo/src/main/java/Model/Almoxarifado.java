package Model;

import java.util.ArrayList;
//import java.util.Scanner;
import javax.persistence.*;

@Entity
@Table(name = "Almoxarifado")
public class Almoxarifado {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @OneToOne
    private Funcionario funcionario;
    private String telefone;
    private String email;
    @ManyToMany
    private ArrayList<Produtos> produtos;

    public Almoxarifado(int id, Funcionario funcionario, String telefone, String email) {
        this.Id = id;
        this.funcionario = funcionario;
        this.telefone = telefone;
        this.email = email;
    }

    public Almoxarifado() {

    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Produtos> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }
}
