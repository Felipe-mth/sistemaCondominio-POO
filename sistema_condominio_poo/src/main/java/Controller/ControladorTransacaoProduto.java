package Controller;

import DAO.DaoClasse.TransacaoProdutoDAO;
import Model.Produtos;
import Model.TransacaoProduto;

import java.util.ArrayList;
import java.util.List;

public class ControladorTransacaoProduto {
    TransacaoProdutoDAO transacaoProdutos = new TransacaoProdutoDAO();

    public void cadastrarTransacaoProduto(double valor, String descricao, ArrayList<Produtos> produtos) {
        this.transacaoProdutos.insertDados(valor, descricao, produtos);
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
