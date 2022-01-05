package View.ControllersJavaFX.Produtos.LivroRazao;

import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class adicionarLivroRazaoController {

    @FXML
    private Button botaoSalvarLivroRazao;

    @FXML
    private Button botaoVoltarLivroRazao;

    @FXML
    void adicionaLivroRazao(MouseEvent event) {

    }

    @FXML
    void voltaTelaLivroRazao(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/LivroRazao/telaLivroRazao.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
