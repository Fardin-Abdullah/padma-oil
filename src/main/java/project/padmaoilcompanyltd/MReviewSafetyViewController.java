package project.padmaoilcompanyltd;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class MReviewSafetyViewController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewComplianceReportOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data Available At This Moment!");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void generateNewReportOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data To Generate At This Moment!");
        alert.showAndWait();
    }
}