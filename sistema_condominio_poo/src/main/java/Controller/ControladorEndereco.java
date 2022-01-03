package Controller;

import DAO.DaoClasse.EnderecoDAO;
import Model.Endereco;

import java.util.List;

public class ControladorEndereco {
    EnderecoDAO endereco = new EnderecoDAO();

    public void cadastrarEndereco(Endereco endereco) {
        this.endereco.insertDados(endereco);
    }

    public void atualizarEndereco(Endereco endereco) {
        this.endereco.updateDados(endereco);
    }

    public void deletarEndereco(Endereco endereco) {
        this.endereco.deleteDados(endereco);
    }

    public Endereco encontrarPeloId(Endereco endereco) {
        return this.endereco.findById(endereco.getId());
    }

    public List<Endereco> encontrarTodos() {
        return this.endereco.findAll();
    }
}
