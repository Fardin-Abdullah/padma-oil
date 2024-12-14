package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EnsureProductQualityComplianceController
{
    @javafx.fxml.FXML
    private TableColumn pHlevelProductQualityTableColumn;
    @javafx.fxml.FXML
    private TableColumn densityQualityTableColumn;
    @javafx.fxml.FXML
    private TextField pHlevelQualityTextField;
    @javafx.fxml.FXML
    private TableColumn purityProductQualityTableColumn;
    @javafx.fxml.FXML
    private TextField purityQualityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> productBatchQualityComboBox;
    @javafx.fxml.FXML
    private TableColumn densityProductQualityTableColumn;
    @javafx.fxml.FXML
    private TextField densityQualityTextField;
    @javafx.fxml.FXML
    private TextField viscosityQualityTextField;
    @javafx.fxml.FXML
    private TableView productQualitySection1TableView;
    @javafx.fxml.FXML
    private TableView productQualitySection2TableVIew;
    @javafx.fxml.FXML
    private TableColumn viscosityProductQualityTableColumn;
    @javafx.fxml.FXML
    private TableColumn purityQualityTableColumn;
    @javafx.fxml.FXML
    private TableColumn viscosityQualityTableColumn;
    @javafx.fxml.FXML
    private AnchorPane ensureProductQualityComplianceAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        productBatchQualityComboBox.getItems().addAll("A","B","C","D");
    }

    @javafx.fxml.FXML
    public void saveResultQualityButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void viewAllResultQualityButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkResultQualityButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backQualityButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(EnsureProductQualityComplianceController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)ensureProductQualityComplianceAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}