package View.ControllersJavaFX.Espacos;

import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class adicionarApartamentosController {

    @FXML
    private TextField Andar;

    @FXML
    private TextField Bloco;

    @FXML
    private TextField NApartamento;
    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarApartamento(MouseEvent event) {

    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
           SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Espacos/telaInicialEspacos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
