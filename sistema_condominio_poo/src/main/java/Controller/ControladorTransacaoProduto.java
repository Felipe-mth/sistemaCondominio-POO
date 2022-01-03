package Controller;

import DAO.DaoClasse.TransacaoProdutoDAO;
import Model.TransacaoProduto;

import java.util.List;

public class ControladorTransacaoProduto {
    TransacaoProdutoDAO transacaoProdutos = new TransacaoProdutoDAO();

    public void cadastrarTransacaoProduto(TransacaoProduto transacaoProdutos) {
        this.transacaoProdutos.insertDados(transacaoProdutos);
    }

    public void atualizarTransacaoProduto(TransacaoProduto transacaoProdutos) {
        this.transacaoProdutos.updateDados(transacaoProdutos);
    }

    public void deletarTransacaoProduto(TransacaoProduto transacaoProdutos) {
        this.transacaoProdutos.deleteDados(transacaoProdutos);
    }

    public TransacaoProduto encontrarPeloId(TransacaoProduto transacaoProdutos) {
        return this.transacaoProdutos.findById(transacaoProdutos.getId());
    }

    public List<TransacaoProduto> encontrarTodos() {
        return this.transacaoProdutos.findAll();
    }
}
