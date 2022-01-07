package View.ControllersJavaFX.Produtos;

import Model.Produtos;
import View.ControllersJavaFX.SceneController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class telaInicialProdutosController implements Initializable {

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
    private ListView<Produtos> listaProdutosCadastrados;

    private ObservableList produtosListaObservavel = FXCollections.observableArrayList();

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listaProdutosCadastrados.setItems(produtosListaObservavel);

        Connection Conn = null;

        try {
            Conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/condominiopoo", "root", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = Conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Produtos");

            while (rs.next()) {
                produtosListaObservavel.add(rs.getString(1));
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {

        }
    }
}
