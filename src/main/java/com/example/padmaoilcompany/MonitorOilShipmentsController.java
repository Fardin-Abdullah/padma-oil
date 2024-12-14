package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MonitorOilShipmentsController
{

    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn estimatedDeliveryTableColumn;
    @javafx.fxml.FXML
    private TableColumn shipmentIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn estimatedDeliveryStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusStatusTableColumn;
    @javafx.fxml.FXML
    private TextField shipmentIdTextField;
    @javafx.fxml.FXML
    private TableColumn shipmentIdStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn lastKnownLocationTableColumn;
    @javafx.fxml.FXML
    private TableColumn locationStatusTableColumn;
    @javafx.fxml.FXML
    private TableView shipmentDetailsTableView;
    @javafx.fxml.FXML
    private TableView shipmentStatusSectionTableView;
    @javafx.fxml.FXML
    private AnchorPane monitorOilShipmentsAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void checkOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void liveDataUpdateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backShipmentButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(MonitorOilShipmentsController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)monitorOilShipmentsAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}