import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcularIluminacaoController {

    @FXML
    private TextField areaTextField;

    @FXML
    private Label resultadoLabel;

    @FXML
    protected void calcular() {
        try {
            double areaMetrosQuadrados = Double.parseDouble(areaTextField.getText());
            double totalVA = CalculoIluminacao.calcularTotalVA(areaMetrosQuadrados);
            int quantidadeDePontos = CalculoIluminacao.calcularQuantidadeDePontos(totalVA);

            resultadoLabel.setText("O ponto de iluminação precisa de " + totalVA + " VA.
" +
                                   "Será necessário " + quantidadeDePontos + " pontos de iluminação na área desejada.");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Resultado do Cálculo");
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
