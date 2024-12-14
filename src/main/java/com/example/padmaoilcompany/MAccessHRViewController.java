package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class MAccessHRViewController {

    @javafx.fxml.FXML
    private ComboBox chooseHRDataComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fetchHRDataButtonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("Cant Fetch Data At This Moment!");
        alert.showAndWait();
    }
}