package View.ControllersJavaFX.Pessoa;
import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class adicionarVisitanteController {
     @FXML
    private TextField Endereco;

    @FXML
    private TextField NCPF;

    @FXML
    private TextField Nome;

    @FXML
    private TextField Telefone;

    @FXML
    private Button botaoAdicionarVisitante;

    @FXML
    private Button botaoCancelar;

    @FXML
    void cadastrarVisitante(MouseEvent event) {
        
    }

    @FXML
    void voltarTelaPessoas(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/Pessoas/telaPessoa.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
