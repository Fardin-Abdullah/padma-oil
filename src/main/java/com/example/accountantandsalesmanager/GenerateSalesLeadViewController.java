package com.example.accountantandsalesmanager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GenerateSalesLeadViewController {

    @FXML
    private TextField leadNameTextField;

    @FXML
    private TextField contactInfoTextField;

    @FXML
    private TextField companyNameTextField;

    @FXML
    private TableView<Lead> leadManagementTableView;

    @FXML
    private TableColumn<Lead, String> leadIdTableColumn;

    @FXML
    private TableColumn<Lead, String> nameTableColumn;

    @FXML
    private TableColumn<Lead, String> companyTableColumn;

    @FXML
    private TableColumn<Lead, String> contactInfoTableColumn;

    @FXML
    private AnchorPane generateSalesLeadAnchorPane;

    private ObservableList<Lead> salesLeadsData = FXCollections.observableArrayList();

    private int leadCounter = 1;

    @FXML
    public void initialize() {
        leadIdTableColumn.setCellValueFactory(data -> data.getValue().idProperty());
        nameTableColumn.setCellValueFactory(data -> data.getValue().nameProperty());
        companyTableColumn.setCellValueFactory(data -> data.getValue().companyProperty());
        contactInfoTableColumn.setCellValueFactory(data -> data.getValue().contactInfoProperty());
        leadManagementTableView.setItems(salesLeadsData);
    }

    @FXML
    public void addNewLeadButtonOnAction(ActionEvent actionEvent) {
        leadNameTextField.clear();
        contactInfoTextField.clear();
        companyNameTextField.clear();
        System.out.println("Ready to add a new lead.");
    }

    @FXML
    public void saveLeadButtonOnAction(ActionEvent actionEvent) {
        String name = leadNameTextField.getText();
        String contactInfo = contactInfoTextField.getText();
        String company = companyNameTextField.getText();

        if (name.isEmpty() || contactInfo.isEmpty() || company.isEmpty()) {
            System.out.println("Please fill all the fields before saving!");
            return;
        }

        Lead newLead = new Lead(String.valueOf(leadCounter++), name, company, contactInfo, "", "", "");
        salesLeadsData.add(newLead);

        leadNameTextField.clear();
        contactInfoTextField.clear();
        companyNameTextField.clear();

        System.out.println("Lead saved successfully: " + newLead);
    }

    @FXML
    public void showTableButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Displaying the current leads in the table.");
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewScene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) generateSalesLeadAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewScene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException("Failed to navigate back to Accountant Dashboard.", e);
        }
    }
}
