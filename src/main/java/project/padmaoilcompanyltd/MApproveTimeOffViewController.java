package project.padmaoilcompanyltd;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

public class MApproveTimeOffViewController
{
    @javafx.fxml.FXML
    private TableView timeOffRequestsTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveTimeOffOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Approve Time-Off");
        alert.setHeaderText(null);
        alert.setContentText("You Can't Approve Any Time-Off At This Moment!");
        alert.showAndWait();
    }
}