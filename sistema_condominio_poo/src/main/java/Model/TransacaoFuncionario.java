package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="Id")
@Table(name = "TransacaoFuncionario")
public class TransacaoFuncionario extends Transacao{

    @ManyToOne
    Funcionario funcionario;

    public TransacaoFuncionario() {
        super();
    }

    public TransacaoFuncionario(double valor, String descricao, Funcionario funcionario) {
        super(valor, descricao);
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
