package View.ControllersJavaFX.Espacos;

import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class adicionarCarroController {

     @FXML
    private ChoiceBox<?> Dono;

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

}
