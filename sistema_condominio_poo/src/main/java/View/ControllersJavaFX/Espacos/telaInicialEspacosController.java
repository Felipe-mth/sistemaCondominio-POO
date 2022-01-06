package View.ControllersJavaFX.Espacos;

import View.ControllersJavaFX.SceneController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class telaInicialEspacosController {
    private int opcao = 1;
    private boolean removerPopUp = false;
    
     @FXML
    private Button botaoTelaInicial;
    
    @FXML
    private Button botaoAdicionar;

    @FXML
    private Button botaoApartamentos;

    @FXML
    private Button botaoCarro;

    @FXML
    private Button botaoEditar;

    @FXML
    private Button botaoEspaco;

    @FXML
    private Button botaoRemover;
    
    

    @FXML
    void listarApartamento(MouseEvent event) {
        this.opcao = 1;
    }

    @FXML
    void listarCarro(MouseEvent event) {
        this.opcao = 2;
    }

    @FXML
    void listarEspaco(MouseEvent event) {
        this.opcao = 3;
    }

    @FXML
    void selecionaAdicionarEspaco(MouseEvent event) throws IOException {
         SceneController controladorCena = new SceneController();
        switch(this.opcao){
            case 1: 
                
                String caminho = "/JavaFX/Pessoas/adicionarApartamentos.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 2: 
                
                 caminho = "/JavaFX/Pessoas/adicionarCarro.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 3:
         
                 caminho = "/JavaFX/Pessoas/adicionarEspaco.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
        }
    }

    @FXML
    void selecionaEditarEspaco(MouseEvent event) throws IOException {
           SceneController controladorCena = new SceneController();
        switch(this.opcao){
            case 1: 
                
                String caminho = "/JavaFX/Pessoas/adicionarApartamentos.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 2: 
                
                 caminho = "/JavaFX/Pessoas/adicionarCarro.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
            case 3:
         
                 caminho = "/JavaFX/Pessoas/adicionarEspaco.fxml";
                controladorCena.voltarParaPaginaAnterior(event, caminho);
                break;
        }
    }

    @FXML
    void selecionaRemoverEspaco(MouseEvent event) {
        this.removerPopUp = true;
    }
    @FXML
     void voltarTelaInicial(MouseEvent event) throws IOException {
        SceneController controladorCena = new SceneController();
        String caminho = "/JavaFX/telaInicial.fxml";

        controladorCena.voltarParaPaginaAnterior(event, caminho);
    }

}
