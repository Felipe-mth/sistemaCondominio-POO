package View.ControllersJavaFX.Produtos.Almoxarifado;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class adicionarFuncionarioController {

    @FXML
    private Button botaoVoltar;

    @FXML
    void voltarParaTelaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/Almoxarifado/Almoxarifado.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
