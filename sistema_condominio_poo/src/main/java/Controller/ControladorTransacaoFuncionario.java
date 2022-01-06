package Controller;

import DAO.DaoClasse.TransacaoFuncionarioDAO;
import Model.Funcionario;
import Model.TransacaoFuncionario;

import java.util.List;

public class ControladorTransacaoFuncionario {
    static TransacaoFuncionarioDAO transacaoFuncionario = new TransacaoFuncionarioDAO();

    public static void cadastrarTransacaoFuncionario(double valor, String descricao, Funcionario funcionario) {
        transacaoFuncionario.insertDados(valor, descricao, funcionario);
    }

    public void atualizarTransacaoFuncionario(TransacaoFuncionario transacaoFuncionario) {
        this.transacaoFuncionario.updateDados(transacaoFuncionario);
    }

    public void deletarTransacaoFuncionario(TransacaoFuncionario transacaoFuncionario) {
        this.transacaoFuncionario.deleteDados(transacaoFuncionario);
    }

    public TransacaoFuncionario encontrarPeloId(TransacaoFuncionario transacaoFuncionario) {
        return this.transacaoFuncionario.findById(transacaoFuncionario.getId());
    }

    public List<TransacaoFuncionario> encontrarTodos() {
        return this.transacaoFuncionario.findAll();
    }
}
