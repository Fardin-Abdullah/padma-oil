package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HRManagerViewController {

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageEmployeeButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void processPayrollButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewTimeOffButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manageBenefitsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackTrainingButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("POCLdashboardView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void updateJobButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void enforcePolicyButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveHireButtonOnAction(ActionEvent actionEvent) {
    }
}