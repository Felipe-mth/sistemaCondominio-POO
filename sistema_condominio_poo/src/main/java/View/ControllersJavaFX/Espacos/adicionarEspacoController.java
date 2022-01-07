package View.ControllersJavaFX.Espacos;

import DAO.DaoClasse.MoradorDAO;
import Model.Morador;
import static View.ControllersJavaFX.Espacos.adicionarCarroController.morador;
import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

public class adicionarEspacoController implements Initializable{
   static MoradorDAO morador = new MoradorDAO();
    @FXML
    private DatePicker Data;

    @FXML
    private ChoiceBox<Integer> Morador;

    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarEspaco(MouseEvent event) {

    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
            SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Espacos/telaInicialEspacos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Integer> reserva = new ArrayList();
        for(Morador item: morador.findAll()){
         reserva.add(item.getId());
        }
    }


}
