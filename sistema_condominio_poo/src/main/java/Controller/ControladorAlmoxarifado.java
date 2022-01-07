package Controller;

import DAO.DaoClasse.AlmoxarifadoDAO;
import Model.Almoxarifado;
import Model.Funcionario;

import java.util.List;

public class ControladorAlmoxarifado {
    static AlmoxarifadoDAO almoxarifado = new AlmoxarifadoDAO();

    public static void cadastrarAlmoxarifado(Funcionario funcionario, String telefone, String email) {
       almoxarifado.insertDados(funcionario, telefone, email);
    }

    public void atualizarAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado.updateDados(almoxarifado);
    }

    public void deletarAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado.deleteDados(almoxarifado);
    }

    public Almoxarifado encontrarPeloId(Almoxarifado almoxarifado) {
        return this.almoxarifado.findById(almoxarifado.getId());
    }

    public List<Almoxarifado> encontrarTodos() {
        return this.almoxarifado.findAll();
    }
}
