package Controller;

import DAO.DaoClasse.TransacaoMoradorDAO;
import Model.TransacaoMoradores;

import java.util.List;

public class ControladorTransacaoMorador {
    TransacaoMoradorDAO transacaoMorador = new TransacaoMoradorDAO();

    public void cadastrarTransacaoMoradores(TransacaoMoradores transacaoMorador) {
        this.transacaoMorador.insertDados(transacaoMorador);
    }

    public void atualizarTransacaoMoradores(TransacaoMoradores transacaoMorador) {
        this.transacaoMorador.updateDados(transacaoMorador);
    }

    public void deletarTransacaoMoradores(TransacaoMoradores transacaoMorador) {
        this.transacaoMorador.deleteDados(transacaoMorador);
    }

    public TransacaoMoradores encontrarPeloId(TransacaoMoradores transacaoMorador) {
        return this.transacaoMorador.findById(transacaoMorador.getId());
    }

    public List<TransacaoMoradores> encontrarTodos() {
        return this.transacaoMorador.findAll();
    }
}
