package Controller;

import DAO.DaoClasse.MoradorDAO;
import Model.Apartamentos;
import Model.Endereco;
import Model.Morador;

import java.util.List;

public class ControladorMorador {
    static MoradorDAO morador = new MoradorDAO();

    public static void cadastrarMorador(Apartamentos apartamento, String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        morador.insertDados(apartamento, cpfCNPJ, telefone, nome, endereco);
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
