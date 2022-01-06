package Controller;

import DAO.DaoClasse.FuncionarioDAO;
import Model.Funcionario;

import java.util.List;
import Model.Endereco;

public class ControladorFuncionario {
    static FuncionarioDAO funcio = new FuncionarioDAO();

    public static void cadastrarFuncionario(String cpf, Endereco endereco, String cargo, double salario, String turno, String telefone, String nome) {
        funcio.insertDados(cpf, endereco, cargo, salario, turno, telefone, nome);
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
