package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class MAssignTasksViewController
{

    @javafx.fxml.FXML
    private ComboBox chooseDeptComboBox;
    @javafx.fxml.FXML
    private ComboBox chooseTaskComboBox;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignTaskButtonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data To Assign At This Moment!");
        alert.showAndWait();
    }
}