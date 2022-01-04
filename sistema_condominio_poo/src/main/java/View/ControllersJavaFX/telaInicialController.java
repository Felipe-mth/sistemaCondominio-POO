package View.ControllersJavaFX;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class telaInicialController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button botaoApartamento;

    @FXML
    private Button botaoPessoas;

    @FXML
    private Button botaoProduto;

    @FXML
    void selecionaMenuApartamentos(MouseEvent event) {

    }

    @FXML
    void selecionaMenuPessoas(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/JavaFX/Pessoas/telaPessoa.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void selecionaMenuProdutos(MouseEvent event) {

    }

}
