package View.ControllersJavaFX.Produtos.LivroDiario;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class adicionarLivroDiarioController {

    @FXML
    private Button botaoSalvar;

    @FXML
    private Button botaoVoltar;

    @FXML
    void adicionaNovoLivroDiario(MouseEvent event) {

    }

    @FXML
    void voltaTelaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroDiario/LivroDiario.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
