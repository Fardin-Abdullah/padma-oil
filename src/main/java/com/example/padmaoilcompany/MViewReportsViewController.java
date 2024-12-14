package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MViewReportsViewController
{
    @javafx.fxml.FXML
    private TableView reportTableView;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn reportColumn4fxid;
    @javafx.fxml.FXML
    private TableColumn reportColumn1fxid;
    @javafx.fxml.FXML
    private TableColumn reportColumn3fxid;
    @javafx.fxml.FXML
    private TableColumn reportColumn2fxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fetchReportOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("No Data Available At This Moment!");
        alert.showAndWait();
    }
}