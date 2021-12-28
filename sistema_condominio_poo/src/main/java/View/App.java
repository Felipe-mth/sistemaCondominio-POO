package View;
import java.io.IOException;
import java.net.URL;
//JavaFX Imports
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @FXML
    public void start(Stage stage) throws IOException {
        URL fxmlLocation = getClass().getResource("/JavaFX/Main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
