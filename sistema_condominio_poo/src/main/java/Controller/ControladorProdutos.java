package Controller;

import DAO.DaoClasse.ProdutosDAO;
import Model.Produtos;

import java.util.List;

public class ControladorProdutos {
    static ProdutosDAO produtos = new ProdutosDAO();

    public static void cadastrarProdutos(Produtos prod) {
        produtos.insertDados(prod);
    }

    public void atualizarProdutos(Produtos produtos) {
        this.produtos.updateDados(produtos);
    }

    public void deletarProdutos(Produtos produtos) {
        this.produtos.deleteDados(produtos);
    }

    public Produtos encontrarPeloNome(Produtos produtos) {
        return this.produtos.findByName(produtos.getNome());
    }

    public Produtos encontrarPeloId(Produtos produtos) {
        return this.produtos.findById(produtos.getId());
    }

    public List<Produtos> encontrarTodos() {
        return this.produtos.findAll();
    }
}
