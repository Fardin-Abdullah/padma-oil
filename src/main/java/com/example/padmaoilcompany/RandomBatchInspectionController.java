package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RandomBatchInspectionController
{
    @javafx.fxml.FXML
    private TableColumn densityBatchTableColumn;
    @javafx.fxml.FXML
    private TableView randomBatchInspection2TabelView;
    @javafx.fxml.FXML
    private TableColumn temperatureBatchTableColumn;
    @javafx.fxml.FXML
    private TextField pHlevelRandomBatchTextField;
    @javafx.fxml.FXML
    private TableColumn oilPurityRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TableColumn temperatureRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TableColumn pHlevelRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TableView randomBatchInspection1TabelView;
    @javafx.fxml.FXML
    private TextField oilPurityRandomBatchTextField;
    @javafx.fxml.FXML
    private TableColumn oilPurityBatchTableColumn;
    @javafx.fxml.FXML
    private TableColumn batchIdRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TableColumn densityRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TableColumn pHlevelBatchTableColumn;
    @javafx.fxml.FXML
    private TextField temperatureRandomBatchTextField;
    @javafx.fxml.FXML
    private TableView randomBatchInspection3TabelView;
    @javafx.fxml.FXML
    private TableColumn productionDateRandomBatchTableColumn;
    @javafx.fxml.FXML
    private TextField densityRandomBatchTextField;
    @javafx.fxml.FXML
    private TableColumn productionTypeRandomBatchTableColumn;
    @javafx.fxml.FXML
    private AnchorPane randomBatchInspectionAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveRandomBatchButtonOnAction(ActionEvent actionEvent) {
        String pHLevel = pHlevelRandomBatchTextField.getText();
        String density = densityRandomBatchTextField.getText();
        String oilPurity = oilPurityRandomBatchTextField.getText();
        String temperature = temperatureRandomBatchTextField.getText();

        if (isInputInvalid(pHLevel, density, oilPurity, temperature)) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please fill in all fields.");
            return;
        }

        String batchDetails = constructBatchDetailsString(pHLevel, density, oilPurity, temperature);
        System.out.println(batchDetails);
        clearInputFields();

        showAlert(Alert.AlertType.INFORMATION, "Batch Inspection Submission", "Batch inspection results saved successfully!");
    }

    private boolean isInputInvalid(String pHLevel, String density, String oilPurity, String temperature) {
        return pHLevel.isEmpty() || density.isEmpty() || oilPurity.isEmpty() || temperature.isEmpty();
    }

    private String constructBatchDetailsString(String pHLevel, String density, String oilPurity, String temperature) {
        return "Batch Inspection Submission:\n" +
                "pH Level: " + pHLevel + "\n" +
                "Density: " + density + "\n" +
                "Oil Purity: " + oilPurity + "\n" +
                "Temperature: " + temperature + "\n";
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearInputFields() {
        pHlevelRandomBatchTextField.clear();
        densityRandomBatchTextField.clear();
        oilPurityRandomBatchTextField.clear();
        temperatureRandomBatchTextField.clear();
    }

    @javafx.fxml.FXML
    public void randomSelectionBatchButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showDateRandomBatchButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showNewDataRandomBatchButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backInspectionButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(RandomBatchInspectionController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)randomBatchInspectionAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}