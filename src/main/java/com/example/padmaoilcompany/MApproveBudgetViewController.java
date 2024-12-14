package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

public class MApproveBudgetViewController
{

    @javafx.fxml.FXML
    private TableView budgetRequestsTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveBudgetOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Approve Budget");
        alert.setHeaderText(null);
        alert.setContentText("You Can't Approve Any Budget At This Moment!");
        alert.showAndWait();
    }
}