package poo.sistema_condominio;
import java.util.ArrayList;
public class Almoxarifado {
    private Funcionario funcionario;
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Produtos> produtos;
    private double precoMedio;

    public Almoxarifado(Funcionario funcionario, String telefone) {
        this.funcionario = funcionario;
        this.telefone = telefone;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }
}
