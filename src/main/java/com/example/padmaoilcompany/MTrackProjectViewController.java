package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

public class MTrackProjectViewController
{
    @javafx.fxml.FXML
    private TableView trackProjectTableView;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateProjectReportOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data To Generate At This Moment!");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void generateAllProjectReportOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data To Generate At This Moment!");
        alert.showAndWait();
    }
}