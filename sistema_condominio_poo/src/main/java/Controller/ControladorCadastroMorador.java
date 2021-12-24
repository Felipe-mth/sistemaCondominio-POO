package Controller;

import DAO.DaoClasse.MoradorDAO;
import Model.Morador;

public class ControladorCadastroMorador {
    MoradorDAO mora = new MoradorDAO();

    public void cadastrarMorador(Morador morador) {
        mora.insertDados(morador);
    }
}
