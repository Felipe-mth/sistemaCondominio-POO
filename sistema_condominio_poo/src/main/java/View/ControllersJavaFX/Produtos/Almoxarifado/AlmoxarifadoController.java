package View.ControllersJavaFX.Produtos.Almoxarifado;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AlmoxarifadoController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoAdicionarFuncionario;

    @FXML
    void adicionarFuncionarioTela(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/Almoxarifado/adicionarFuncionario.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltarParaTelaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}