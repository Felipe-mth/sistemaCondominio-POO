package Controller;

import DAO.DaoClasse.ApartamentosDAO;
import Model.Apartamentos;

import java.util.List;

public class ControladorApartamentos {
    static ApartamentosDAO apartamentos = new ApartamentosDAO();

    public static void cadastrarApartamentos(int numeroApartamento, int andar,  int bloco) {
        apartamentos.insertDados(numeroApartamento, andar, bloco);
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
