package View.ControllersJavaFX.Produtos.LivroRazao;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class telaLivroRazaoController {

    @FXML
    private Button botaoAdicionarProduto;

    @FXML
    private Button botaoLivroDiario;

    @FXML
    private Button botaoNovoLivro;

    @FXML
    private Button botaoVoltar;

    @FXML
    void adicionarLivroRazao(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroRazao/adicionarLivroRazao.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void telaAdicionarProduto(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/adicionarProduto.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltaAlmoxarifado(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/Almoxarifado/Almoxarifado.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltaLivroDiario(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroDiario/LivroDiario.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltarTelaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
