package com.example.accountantandsalesmanager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class QualifySalesLeadViewController {

    @javafx.fxml.FXML
    private TextField budgetTextField;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> nameTableColumn;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> companyTableColumn;

    @javafx.fxml.FXML
    private ComboBox<String> leadStatusComboBox;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> leadIdTableColumn;

    @javafx.fxml.FXML
    private TableView<Lead> leadQualificationTableView;

    @javafx.fxml.FXML
    private TableColumn<Lead, String> contactInfoTableColumn;

    @javafx.fxml.FXML
    private TextField decisionMakerTextField;

    @javafx.fxml.FXML
    private AnchorPane qualifySalesLeadAnchorPane;

    private final ObservableList<Lead> leadObservableList = FXCollections.observableArrayList();
    private Lead selectedLead;

    @javafx.fxml.FXML
    public void initialize() {

        leadIdTableColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        nameTableColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        companyTableColumn.setCellValueFactory(cellData -> cellData.getValue().companyProperty());
        contactInfoTableColumn.setCellValueFactory(cellData -> cellData.getValue().contactInfoProperty());


        leadStatusComboBox.setItems(FXCollections.observableArrayList("Qualified", "Unqualified"));


        leadQualificationTableView.setItems(leadObservableList);
    }

    @javafx.fxml.FXML
    public void selectLeadButtonOnAction(ActionEvent actionEvent) {
        selectedLead = leadQualificationTableView.getSelectionModel().getSelectedItem();

        if (selectedLead == null) {
            showAlert(Alert.AlertType.ERROR, "Selection Error", "No lead selected. Please select a lead from the table.");
            return;
        }

        budgetTextField.setText(selectedLead.getBudget());
        decisionMakerTextField.setText(selectedLead.getDecisionMaker());
        leadStatusComboBox.setValue(selectedLead.getStatus());
    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
        if (selectedLead == null) {
            showAlert(Alert.AlertType.ERROR, "Save Error", "No lead selected. Please select a lead first.");
            return;
        }


        String budget = budgetTextField.getText().trim();
        String decisionMaker = decisionMakerTextField.getText().trim();
        String status = leadStatusComboBox.getValue();

        if (budget.isEmpty() || decisionMaker.isEmpty() || status == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled out.");
            return;
        }

        selectedLead.setBudget(budget);
        selectedLead.setDecisionMaker(decisionMaker);
        selectedLead.setStatus(status);

        leadQualificationTableView.refresh();
        showAlert(Alert.AlertType.INFORMATION, "Success", "Lead details updated successfully.");
        clearFields();
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) qualifySalesLeadAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void showTableButtonOnAction(ActionEvent actionEvent) {
        leadQualificationTableView.setItems(leadObservableList);
    }

    private void clearFields() {
        budgetTextField.clear();
        decisionMakerTextField.clear();
        leadStatusComboBox.setValue(null);
        selectedLead = null;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public void loadMockData() {
        List<Lead> mockLeads = List.of(
                new Lead("1", "Person1", "ABC Corp", "01722222222", "10000", "Yes", "Qualified"),
                new Lead("2", "Person2", "XYZ Inc", "01723444444", "20000", "No", "Unqualified")
        );
        leadObservableList.addAll(mockLeads);
    }
}
