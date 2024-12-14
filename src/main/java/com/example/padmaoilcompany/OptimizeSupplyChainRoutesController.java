package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OptimizeSupplyChainRoutesController
{
    @javafx.fxml.FXML
    private Label selectShipmentOptimizationComboBox;
    @javafx.fxml.FXML
    private TableColumn currentStatusOptimizationTableColumn;
    @javafx.fxml.FXML
    private TableView routeOptimizationTableView;
    @javafx.fxml.FXML
    private TableColumn distanceOptimizationTableColumn;
    @javafx.fxml.FXML
    private TableColumn extimatedCostOptimizationTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> routeFromComboBox;
    @javafx.fxml.FXML
    private TableColumn destinationOptimizationTableColum;
    @javafx.fxml.FXML
    private TableColumn routeToOptimizationTableColumn;
    @javafx.fxml.FXML
    private DatePicker estimatedTimeOptimizationDatePicker;
    @javafx.fxml.FXML
    private TableColumn estimatedDeliveryOptimizationTableColumn;
    @javafx.fxml.FXML
    private TableView optimizationRouteTableView;
    @javafx.fxml.FXML
    private TableColumn shipmentIdOptimizationTableColm;
    @javafx.fxml.FXML
    private ComboBox<String> routeToComboBox;
    @javafx.fxml.FXML
    private TableColumn routeFromOptimizationTableColumn;
    @javafx.fxml.FXML
    private AnchorPane routeOptimizationAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        routeToComboBox.getItems().addAll("a","b","c","d");
        routeFromComboBox.getItems().addAll("1","2","3","4");

    }

    @javafx.fxml.FXML
    public void confirmOptimizationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchRouteButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backRouteButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(OptimizeSupplyChainRoutesController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)routeOptimizationAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}