package Controller;

import DAO.DaoClasse.TransacaoMoradorDAO;
import Model.Morador;
import Model.TransacaoMoradores;

import java.util.List;

public class ControladorTransacaoMorador {
    static TransacaoMoradorDAO transacaoMorador = new TransacaoMoradorDAO();

    public static void cadastrarTransacaoMoradores(double valor, String descricao, Morador morador) {
        transacaoMorador.insertDados(valor, descricao, morador);
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
