package View.ControllersJavaFX.Produtos.LivroDiario;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class livroDiarioController {

    @FXML
    private Button botaoAlmoxarifado;

    @FXML
    private Button botaoLivroRazao;

    @FXML
    private Button botaoNovoLivro;

    @FXML
    private Button botaoProdutos;

    @FXML
    private Button botaoVoltar;

    @FXML
    void adicionarNovoLivroDiario(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroDiario/adicionarLivroDiario.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void telaAlmoxarifado(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/Almoxarifado/Almoxarifado.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void telaLivroRazao(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroRazao/telaLivroRazao.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void telaProdutos(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

    @FXML
    void voltaParaTelaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
