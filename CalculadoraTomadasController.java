import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraTomadasController {

    @FXML
    private TextField areaTextField;

    @FXML
    private TextField perimetroTextField;

    @FXML
    private Label resultadoLabel;

    @FXML
    protected void calcular() {
        try {
            double area = Double.parseDouble(areaTextField.getText());
            double perimetro = Double.parseDouble(perimetroTextField.getText());

            int numerodetomadas = CalculoTomadas.calcularNumeroDeTomadas(area, perimetro);
            resultadoLabel.setText("Devem ser instaladas " + numerodetomadas + " tomadas nessa área.");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Resultado");
            alert.setHeaderText(null);
            alert.setContentText(resultadoLabel.getText());
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, insira valores válidos.");
            alert.showAndWait();
        }
    }
}
