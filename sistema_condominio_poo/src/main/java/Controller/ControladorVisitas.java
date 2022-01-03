package Controller;

import DAO.DaoClasse.VisitasDAO;
import Model.Visitas;

import java.util.List;

public class ControladorVisitas {
    VisitasDAO visitas = new VisitasDAO();

    public void cadastrarVisitas(Visitas visitas) {
        this.visitas.insertDados(visitas);
    }

    public void atualizarVisitas(Visitas visitas) {
        this.visitas.updateDados(visitas);
    }

    public void deletarVisitas(Visitas visitas) {
        this.visitas.deleteDados(visitas);
    }

    public Visitas encontrarPeloNome(Visitas visitas) {
        return this.visitas.findByName(visitas.getNome());
    }

    public Visitas encontrarPeloId(Visitas visitas) {
        return this.visitas.findById(visitas.getId());
    }

    public List<Visitas> encontrarTodos() {
        return this.visitas.findAll();
    }
}
