package Controller;

import DAO.DaoClasse.ProdutosDAO;
import Model.Fornecedor;
import Model.Produtos;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.util.List;

public class ControladorProdutos {
    static ProdutosDAO produtos = new ProdutosDAO();

    public static void cadastrarProdutos(Fornecedor fornecedor, int quantidadeMinima, double preco, String nome, int quantidade) {
        produtos.insertDados(fornecedor, quantidadeMinima, preco, nome, quantidade);
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
