package View.ControllersJavaFX.Pessoa;
import View.ControllersJavaFX.SceneController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class telaPessoaController {
    private int opcao = 3;
    private boolean removerPopUp = false;
    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoEditarPessoa;

    @FXML
    private Button botaoFornecedor;

    @FXML
    private Button botaoFuncionario;

    @FXML
    private Button botaoMorador;

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoVisitante;

    @FXML
    void listarFornecedor(MouseEvent event) {
        this.opcao = 1;
    }

    @FXML
    void listarFuncionarios(MouseEvent event) {
        this.opcao = 2;
    }

    @FXML
    void listarMorador(MouseEvent event) {
        this.opcao = 3;
    }

    @FXML
    void listarVisitante(MouseEvent event) {
        this.opcao = 4;
    }

    @FXML
    void selecionarCadastrarPessoa(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        switch(this.opcao){
            case 1: 
                
                String caminho = "/JavaFX/Pessoas/adicionarFornecedor.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 2: 
                
                 caminho = "/JavaFX/Pessoas/adicionarFuncionario.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 3:
         
                 caminho = "/JavaFX/Pessoas/adicionarMorador.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 4: 
                 caminho = "/JavaFX/Pessoas/adicionarVisitante.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
        }
    }

    @FXML
    void selecionarEditarPessoa(MouseEvent event) throws IOException {
          SceneController controladorCena = new SceneController();
        switch(this.opcao){
            case 1: 
                
                String caminho = "/JavaFX/Pessoas/adicionarFornecedor.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 2: 
                
                 caminho = "/JavaFX/Pessoas/adicionarFuncionario.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 3:
         
                 caminho = "/JavaFX/Pessoas/adicionarMorador.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 4: 
                 caminho = "/JavaFX/Pessoas/adicionarVisitante.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
    }
    }

    
    @FXML
    void selecionarRemoverPessoa(MouseEvent event) {
        this.removerPopUp = true;
    }
    @FXML
    void voltarTelaInicial(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/telaInicial.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
