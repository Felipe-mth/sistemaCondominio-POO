package Controller;

import DAO.DaoClasse.VisitasDAO;
import Model.Endereco;
import Model.Morador;
import Model.Visitas;

import java.util.List;

public class ControladorVisitas {
    VisitasDAO visitas = new VisitasDAO();

    public void cadastrarVisitas(String cpfCNPJ, String telefone, String nome, Endereco endereco, int horarioVisita, int periodoVisita, int dataVisita, Morador moradorVisitado) {
        this.visitas.insertDados(cpfCNPJ, telefone, nome, endereco, horarioVisita, periodoVisita, dataVisita, moradorVisitado);
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
