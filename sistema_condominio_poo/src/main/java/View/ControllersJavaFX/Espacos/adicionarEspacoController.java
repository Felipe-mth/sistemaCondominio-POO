package View.ControllersJavaFX.Espacos;

import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class adicionarEspacoController {

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

}
