package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrackSalesPipelineViewController
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableView salesPipelineTableView;
    @javafx.fxml.FXML
    private TableColumn opportunityIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn expectedTableColumn;
    @javafx.fxml.FXML
    private TableColumn closeDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox updateStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn clientNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
    }
}