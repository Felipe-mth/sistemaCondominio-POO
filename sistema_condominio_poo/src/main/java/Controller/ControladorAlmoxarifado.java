package Controller;

import DAO.DaoClasse.AlmoxarifadoDAO;
import Model.Almoxarifado;

import java.util.List;

public class ControladorAlmoxarifado {
    AlmoxarifadoDAO almoxarifado = new AlmoxarifadoDAO();

    public void cadastrarAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado.insertDados(almoxarifado);
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
