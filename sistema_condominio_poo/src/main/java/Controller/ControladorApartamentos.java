package Controller;

import DAO.DaoClasse.ApartamentosDAO;
import Model.Apartamentos;

import java.util.List;

public class ControladorApartamentos {
    ApartamentosDAO apartamentos = new ApartamentosDAO();

    public void cadastrarApartamentos(Apartamentos apartamentos) {
        this.apartamentos.insertDados(apartamentos);
    }

    public void atualizarApartamentos(Apartamentos apartamentos) {
        this.apartamentos.updateDados(apartamentos);
    }

    public void deletarApartamentos(Apartamentos apartamentos) {
        this.apartamentos.deleteDados(apartamentos);
    }

    public Apartamentos encontrarPeloId(Apartamentos apartamentos) {
        return this.apartamentos.findById(apartamentos.getnumeroDoApartamento());
    }

    public List<Apartamentos> encontrarTodos() {
        return this.apartamentos.findAll();
    }
}
