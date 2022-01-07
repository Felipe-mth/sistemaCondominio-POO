package View.ControllersJavaFX.Espacos;

import DAO.DaoClasse.MoradorDAO;
import Model.Morador;
import View.ControllersJavaFX.SceneController;
import java.awt.event.ActionEvent;
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

public class adicionarCarroController implements Initializable {
    static MoradorDAO morador = new MoradorDAO();
     @FXML
    private ChoiceBox<Integer> Dono;
     
    @FXML
    private TextField Modelo;

    @FXML
    private TextField Placa;
    
    @FXML
    private Button adicionarBotao;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarCarro(MouseEvent event) {

    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
              SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Espacos/telaInicialEspacos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Integer> dono = new ArrayList();
        for(Morador item: morador.findAll()){
         dono.add(item.getId());
        }
    }

}
