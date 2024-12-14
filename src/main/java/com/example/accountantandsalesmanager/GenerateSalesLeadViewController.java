package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GenerateSalesLeadViewController {

    // FXML fields representing the UI elements
    @javafx.fxml.FXML
    private TextField leadNameTextField;

    @javafx.fxml.FXML
    private TableView<Lead> leadManagementTableView;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> nameTableColumn;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> companyTableColumn;

    @javafx.fxml.FXML
    private TextField contactInfoTextField;

    @javafx.fxml.FXML
    private TextField companyNameTextField;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> leadIdTableColumn;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> contactInfoTableColumn;

    @javafx.fxml.FXML
    private AnchorPane generateSalesLeadAnchorPane;

    // List to store leads in memory
    private List<Lead> leadList = new ArrayList<>();

    // Initialize method for setting up the table columns, if needed
    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        companyTableColumn.setCellValueFactory(cellData -> cellData.getValue().companyProperty());
        contactInfoTableColumn.setCellValueFactory(cellData -> cellData.getValue().contactInfoProperty());

        // Load any existing leads (if any)
        leadManagementTableView.getItems().addAll(leadList);
    }

    // Action method for saving a new lead
    @javafx.fxml.FXML
    public void saveLeadButtonOnAction(ActionEvent actionEvent) {
        String name = leadNameTextField.getText();
        String contactInfo = contactInfoTextField.getText();
        String company = companyNameTextField.getText();

        if (name.isEmpty() || contactInfo.isEmpty() || company.isEmpty()) {
            // Alert the user if any field is empty
            showAlert(AlertType.ERROR, "Input Error", "Please fill in all fields before saving.");
            return;
        }

        // Create a new Lead object
        Lead newLead = new Lead(name, contactInfo, company);

        // Add the new lead to the list and table view
        leadList.add(newLead);
        leadManagementTableView.getItems().add(newLead);

        // Clear the input fields after saving
        leadNameTextField.clear();
        contactInfoTextField.clear();
        companyNameTextField.clear();
    }

    // Action method for adding a new lead (clearing the fields for a new entry)
    @javafx.fxml.FXML
    public void addNewLeadButtonOnAction(ActionEvent actionEvent) {
        leadNameTextField.clear();
        contactInfoTextField.clear();
        companyNameTextField.clear();
    }

    // Action method for going back to the dashboard
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) generateSalesLeadAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            showAlert(AlertType.ERROR, "Navigation Error", "Failed to navigate back to the dashboard.");
        }
    }

    // Utility method to show alert messages
    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
