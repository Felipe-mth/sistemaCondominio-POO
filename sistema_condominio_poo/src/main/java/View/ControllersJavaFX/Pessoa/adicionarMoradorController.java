package View.ControllersJavaFX.Pessoa;

import DAO.DaoClasse.ApartamentosDAO;
import Model.Apartamentos;
import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class adicionarMoradorController implements Initializable{
       static ApartamentosDAO apartamentos = new ApartamentosDAO();
     @FXML
    private ChoiceBox<Integer> Apartamento;

    @FXML
    private TextField Endereco;

    @FXML
    private TextField NCPF;

    @FXML
    private TextField Nome;

    @FXML
    private TextField Telefone;


    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarMorador(MouseEvent event) {

    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Pessoas/telaPessoa.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Integer> dono = new ArrayList();
        for(Apartamentos item: apartamentos.findAll()){
         dono.add(item.getnumeroDoApartamento());
        }
    }

}
