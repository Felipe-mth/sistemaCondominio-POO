package Controller;

import DAO.DaoClasse.CarroDAO;
import Model.Carro;
import Model.Morador;

import java.util.List;

public class ControladorCarro {
    static CarroDAO carros = new CarroDAO();

    public static void cadastrarCarro(String placa, String modelo, Morador dono) {
        carros.insertDados(placa, modelo, dono);
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
