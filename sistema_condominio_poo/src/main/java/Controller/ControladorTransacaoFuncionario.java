package Controller;

import DAO.DaoClasse.TransacaoFuncionarioDAO;
import Model.TransacaoFuncionario;

import java.util.List;

public class ControladorTransacaoFuncionario {
    TransacaoFuncionarioDAO transacaoFuncionario = new TransacaoFuncionarioDAO();

    public void cadastrarTransacaoFuncionario(TransacaoFuncionario transacaoFuncionario) {
        this.transacaoFuncionario.insertDados(transacaoFuncionario);
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
