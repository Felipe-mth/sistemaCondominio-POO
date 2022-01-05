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
    private Button botaoAlmoxarifado;

    @FXML
    private Button botaoEditar;

    @FXML
    private Button botaoLivroDiario;

    @FXML
    private Button botaoLivroRazao;

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoTelaInicial;

    @FXML
    void adicionarProduto(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/adicionarProduto.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void editarProduto(MouseEvent event) {

    }

    @FXML
    void removerProduto(MouseEvent event) {

    }

    @FXML
    void entraEmAlmoxarifado(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/Almoxarifado/Almoxarifado.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void entraLivroDiario(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroDiario/LivroDiario.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void entraLivroRazao(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroRazao/telaLivroRazao.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltarTelaInicial(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/telaInicial.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }
}
