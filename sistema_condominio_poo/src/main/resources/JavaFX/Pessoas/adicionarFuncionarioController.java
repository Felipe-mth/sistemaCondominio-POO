package View.ControllersJavaFX.Pessoa;

import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class adicionarFuncionarioController {

    @FXML
    private Button botaoCadastrar;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarFuncionario(MouseEvent event) {

    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
         SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Pessoas/telaPessoa.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
