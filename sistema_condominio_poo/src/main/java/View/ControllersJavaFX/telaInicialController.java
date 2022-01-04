package View.ControllersJavaFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class telaInicialController {

    @FXML
    private Button botaoApartamento;

    @FXML
    private Button botaoPessoas;

    @FXML
    private Button botaoProduto;

    @FXML
    void selecionaMenuEspacos(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Espacos/telaInicialEspacos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void selecionaMenuPessoas(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Pessoas/telaPessoa.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void selecionaMenuProdutos(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
