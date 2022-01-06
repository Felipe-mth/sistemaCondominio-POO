package Controller;

import DAO.DaoClasse.EspacoDAO;
import Model.Espaco;
import Model.Morador;

import java.util.Date;
import java.util.List;

public class ControladorEspaco {
    static EspacoDAO espaco = new EspacoDAO();

    public static void cadastrarEspaco(Date data, Morador morador) {
        espaco.insertDados(data, morador);
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
