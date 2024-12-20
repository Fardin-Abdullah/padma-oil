package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReportNonCompliantProductsController
{
    @javafx.fxml.FXML
    private ComboBox<String> NonComplianceTypeNonComplianceComboBox;
    @javafx.fxml.FXML
    private TableColumn productionDateNonComplianceTableColumn;
    @javafx.fxml.FXML
    private TableColumn batchIdNonComplianceTableColumn;
    @javafx.fxml.FXML
    private TableColumn productTypeNonComplianceTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdNonComplianceComboBox;
    @javafx.fxml.FXML
    private TableView NonComplianceSectionTableView;
    @javafx.fxml.FXML
    private TextField descriptionNonComplianceTextField;
    @javafx.fxml.FXML
    private TableColumn complianceStatusNonComplianceTableColumn;
    @javafx.fxml.FXML
    private Label NonCompliance;
    @javafx.fxml.FXML
    private ComboBox<String> productNameNonComplianceComboBox;
    @javafx.fxml.FXML
    private AnchorPane nonComplianceSectionAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        NonComplianceTypeNonComplianceComboBox.getItems().addAll("A","B","C","D");
        batchIdNonComplianceComboBox.getItems().addAll("E","F","G","H");
        productNameNonComplianceComboBox.getItems().addAll("W","Q","R","T");
    }

    @Deprecated
    public void alu(ActionEvent actionEvent) {
    }

    @Deprecated
    public void tomto(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchNonComplianceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitReportNonComplianceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backNonComplianceButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ReportNonCompliantProductsController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)nonComplianceSectionAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}