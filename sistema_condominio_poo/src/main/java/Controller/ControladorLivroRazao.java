package Controller;

import DAO.DaoClasse.livroRazaoDAO;
import Model.livroRazao;

import java.util.List;

public class ControladorLivroRazao {
    livroRazaoDAO livroRazao = new livroRazaoDAO();

    public void cadastrarLivroRazao(int mes,String criadoPor, double montante) {
        this.livroRazao.insertDados(mes, criadoPor, montante);
    }


    public void atualizarLivroRazao(livroRazao livroRazao) {
        this.livroRazao.updateDados(livroRazao);
    }

    public void deletarLivroRazao(livroRazao livroRazao) {
        this.livroRazao.deleteDados(livroRazao);
    }

    /*public livroRazao encontrarPeloNome(livroRazao livroRazao) {
        return this.livroRazao.findByName(livroRazao.getNome());
    }

    public livroRazao encontrarPeloId(livroRazao livroRazao) {
        return this.livroRazao.findById(livroRazao.getId());
    }*/

    public List<livroRazao> encontrarTodos() {
        return this.livroRazao.findAll();
    }
}
