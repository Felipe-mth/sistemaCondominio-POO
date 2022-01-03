package Controller;

import DAO.DaoClasse.CarroDAO;
import Model.Carro;

import java.util.List;

public class ControladorCarro {
    CarroDAO carros = new CarroDAO();

    public void cadastrarCarro(Carro carros) {
        this.carros.insertDados(carros);
    }

    public void atualizarCarro(Carro carros) {
        this.carros.updateDados(carros);
    }

    public void deletarCarro(Carro carros) {
        this.carros.deleteDados(carros);
    }

    public Carro encontrarPeloNome(Carro carros) {
        return this.carros.findByName(carros.getModelo());
    }

    public Carro encontrarPeloId(Carro carros) {
        return this.carros.findById(carros.getPlaca());
    }

    public List<Carro> encontrarTodos() {
        return this.carros.findAll();
    }
}
