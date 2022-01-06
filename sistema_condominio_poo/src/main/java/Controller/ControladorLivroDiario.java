package Controller;

import DAO.DaoClasse.livroDiarioDAO;
import Model.livroDiario;

import java.util.List;

public class ControladorLivroDiario {
    livroDiarioDAO livroDiario = new livroDiarioDAO();

    public void cadastrarLivroDiario(livroDiario livroDiario) {
        this.livroDiario.insertDados(livroDiario);
    }

    public void atualizarLivroDiario(livroDiario livroDiario) {
        this.livroDiario.updateDados(livroDiario);
    }

    public void deletarLivroDiario(livroDiario livroDiario) {
        this.livroDiario.deleteDados(livroDiario);
    }

    /*public livroDiario encontrarPeloNome(livroDiario livroDiario) {
        return this.livroDiario.findByName(livroDiario.getNome());
    }

    public livroDiario encontrarPeloId(livroDiario livroDiario) {
        return this.livroDiario.findById(livroDiario.getId());
    }*/

    public List<livroDiario> encontrarTodos() {
        return this.livroDiario.findAll();
    }
}