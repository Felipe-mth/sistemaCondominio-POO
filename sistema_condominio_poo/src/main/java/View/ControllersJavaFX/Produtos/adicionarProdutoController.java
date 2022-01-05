package View.ControllersJavaFX.Produtos;

import Controller.ControladorProdutos;
import Model.Produtos;
import View.ControllersJavaFX.SceneController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class adicionarProdutoController {

    @FXML
    private Button botaoAdicionarProduto;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField nomeProduto;

    @FXML
    private TextField precoProduto;

    @FXML
    private TextField quantidadeMinimaProduto;

    @FXML
    private TextField quantidadeProduto;

    @FXML
    void adicionarProduto(MouseEvent event) {
        Produtos prod = new Produtos();
        ControladorProdutos.cadastrarProdutos(prod);
    }

    @FXML
    void voltarParaPaginaAnterior(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Produtos/telaProdutos.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}