package Controller;

import DAO.DaoClasse.FuncionarioDAO;
import Model.Funcionario;

import java.util.List;

public class ControladorFuncionario {
    FuncionarioDAO funcio = new FuncionarioDAO();

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcio.insertDados(funcionario);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        this.funcio.updateDados(funcionario);
    }

    public void deletarFuncionario(Funcionario funcionario) {
        this.funcio.deleteDados(funcionario);
    }

    public Funcionario encontrarPeloNome(Funcionario funcionario) {
        return this.funcio.findByName(funcionario.getNome());
    }

    public Funcionario encontrarPeloId(Funcionario funcionario) {
        return this.funcio.findById(funcionario.getId());
    }

    public List<Funcionario> encontrarTodos() {
        return this.funcio.findAll();
    }
}
