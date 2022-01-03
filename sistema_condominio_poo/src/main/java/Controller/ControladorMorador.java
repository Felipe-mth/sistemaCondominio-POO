package Controller;

import DAO.DaoClasse.MoradorDAO;
import Model.Morador;

import java.util.List;

public class ControladorMorador {
    MoradorDAO morador = new MoradorDAO();

    public void cadastrarMorador(Morador morador) {
        this.morador.insertDados(morador);
    }

    public void atualizarMorador(Morador morador) {
        this.morador.updateDados(morador);
    }

    public void deletarMorador(Morador morador) {
        this.morador.deleteDados(morador);
    }

    public Morador encontrarPeloNome(Morador morador) {
        return this.morador.findByName(morador.getNome());
    }

    public Morador encontrarPeloId(Morador morador) {
        return this.morador.findById(morador.getId());
    }

    public List<Morador> encontrarTodos() {
        return this.morador.findAll();
    }
}
