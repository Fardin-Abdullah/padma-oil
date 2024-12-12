package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AnalyzeSalesPerformanceViewController
{
    @javafx.fxml.FXML
    private TableView salesperformanceTableView;
    @javafx.fxml.FXML
    private TableColumn varianceTableColumn;
    @javafx.fxml.FXML
    private TableColumn actualTableColumn;
    @javafx.fxml.FXML
    private TableColumn targetTableColumn;
    @javafx.fxml.FXML
    private TableColumn metricTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateperformancereportButtonOnAction(ActionEvent actionEvent) {
    }
}