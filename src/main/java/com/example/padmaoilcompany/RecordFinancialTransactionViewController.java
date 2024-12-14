package com.example.padmaoilcompany;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class RecordFinancialTransactionViewController {

    @javafx.fxml.FXML
    private AnchorPane recordFinancialTransactionAnchorPane;
    @javafx.fxml.FXML
    private ComboBox<String> transactionTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Transaction, Double> amountTableColumn;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private DatePicker transactionDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Transaction, LocalDate> transactionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> transactionTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView<Transaction> financialTransaxtionTableView;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> descriptionTableColumn;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TableColumn<Transaction, String> paymentMethodTableColumn;

    private final ObservableList<Transaction> transactions = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        transactionTypeComboBox.setItems(FXCollections.observableArrayList("Income", "Expense"));
        paymentMethodComboBox.setItems(FXCollections.observableArrayList("Cash", "Card", "Bank Transfer"));
        transactionTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("transactionType"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentMethodTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
        transactionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("transactionDate"));
        financialTransaxtionTableView.setItems(transactions);
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        try {
            if (descriptionTextField.getText().isEmpty() ||
                    amountTextField.getText().isEmpty() ||
                    transactionTypeComboBox.getValue() == null ||
                    paymentMethodComboBox.getValue() == null ||
                    transactionDatePicker.getValue() == null) {

                showAlert(Alert.AlertType.ERROR, "Validation Error", "All fields are required!");
                return;
            }

            double amount;
            try {
                amount = Double.parseDouble(amountTextField.getText());
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter a valid number for the amount!");
                return;
            }

            String description = descriptionTextField.getText();
            String transactionType = transactionTypeComboBox.getValue();
            String paymentMethod = paymentMethodComboBox.getValue();
            LocalDate transactionDate = transactionDatePicker.getValue();

            Transaction transaction = new Transaction(description, transactionType, paymentMethod, transactionDate, amount);
            transactions.add(transaction);

            clearFields();

            showAlert(Alert.AlertType.INFORMATION, "Success", "Transaction saved successfully!");
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "An unexpected error occurred: " + e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void showTableViewTransactionHistoryButtonOnAction(ActionEvent actionEvent) {
        financialTransaxtionTableView.setVisible(true);
        financialTransaxtionTableView.refresh();
        showAlert(Alert.AlertType.INFORMATION, "Transaction History", "Transaction history is now visible.");
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) recordFinancialTransactionAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void clearFields() {
        descriptionTextField.clear();
        amountTextField.clear();
        transactionTypeComboBox.setValue(null);
        paymentMethodComboBox.setValue(null);
        transactionDatePicker.setValue(null);
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
