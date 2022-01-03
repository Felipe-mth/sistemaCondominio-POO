package Controller;

import DAO.DaoClasse.EspacoDAO;
import Model.Espaco;

import java.util.List;

public class ControladorEspaco {
    EspacoDAO espaco = new EspacoDAO();

    public void cadastrarEspaco(Espaco espaco) {
        this.espaco.insertDados(espaco);
    }

    public void atualizarEspaco(Espaco espaco) {
        this.espaco.updateDados(espaco);
    }

    public void deletarEspaco(Espaco espaco) {
        this.espaco.deleteDados(espaco);
    }

    public Espaco encontrarPeloId(Espaco espaco) {
        return this.espaco.findById(espaco.getId());
    }

    public List<Espaco> encontrarTodos() {
        return this.espaco.findAll();
    }
}
