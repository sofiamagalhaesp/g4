import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CalcularIluminacao extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CalcularIluminacao.fxml"));
            primaryStage.setTitle("Cálculo de Iluminação");
            primaryStage.setScene(new Scene(root, 300, 200));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
