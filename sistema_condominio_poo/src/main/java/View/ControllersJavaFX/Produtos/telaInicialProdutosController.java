package View.ControllersJavaFX.Produtos;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class telaInicialProdutosController {

    @FXML
    private Button botaoAdicionarTelaProduto;

    @FXML
    private Button botaoTelaInicial;

    @FXML
    void adicionarProduto(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/adicionarProduto.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }


    @FXML
    void voltarTelaInicial(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/telaInicial.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }
}
