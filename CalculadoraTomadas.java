import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CalculadoraTomadas extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CalculadoraTomadas.fxml"));
            primaryStage.setTitle("Calculadora de Tomadas");
            primaryStage.setScene(new Scene(root, 300, 200));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
