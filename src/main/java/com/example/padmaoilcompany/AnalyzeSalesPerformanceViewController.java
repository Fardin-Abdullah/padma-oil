package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private AnchorPane analyzeSalesPerformanceAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateperformancereportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)analyzeSalesPerformanceAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}