package Controller;

import Model.Fornecedor;
import DAO.DaoClasse.FornecedorDAO;
import java.util.List;

public class ControladorFornecedor {
    FornecedorDAO fornecedor = new FornecedorDAO();

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        this.fornecedor.insertDados(fornecedor);
    }

    public void atualizarFornecedor(Fornecedor fornecedor) {
        this.fornecedor.updateDados(fornecedor);
    }

    public void deletarFornecedor(Fornecedor fornecedor) {
        this.fornecedor.deleteDados(fornecedor);
    }

    public Fornecedor encontrarPeloNome(Fornecedor fornecedor) {
        return this.fornecedor.findByName(fornecedor.getNome());
    }

    public Fornecedor encontrarPeloId(Fornecedor fornecedor) {
        return this.fornecedor.findById(fornecedor.getId());
    }

    public List<Fornecedor> encontrarTodos() {
        return this.fornecedor.findAll();
    }
}
