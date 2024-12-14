package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ManageAccountsPayableViewController {

    @FXML
    private AnchorPane manageAccPayableAnchorPane;
    @FXML
    private ComboBox<String> vendorSelctionComboBox;
    @FXML
    private ComboBox<String> paymentMethodComboBox;
    @FXML
    private TextField invoiceNumberTextField;
    @FXML
    private TextField paymentAmmountTextField;
    @FXML
    private TextField transactionIdTextField;
    @FXML
    private DatePicker paymentDatePicker;
    @FXML
    private DatePicker invoiceDueDatePicker;
    @FXML
    private TableView<PaymentRecord> manageAccountsPayableTableView;
    @FXML
    private TableColumn<PaymentRecord, String> invoiceNumTableColumn;
    @FXML
    private TableColumn<PaymentRecord, String> vendorNameTableColumn;
    @FXML
    private TableColumn<PaymentRecord, LocalDate> invoiceDateTableColumn;
    @FXML
    private TableColumn<PaymentRecord, LocalDate> dueDateTableColumn;
    @FXML
    private TableColumn<PaymentRecord, Double> amountTableColumn;
    @FXML
    private TableColumn<PaymentRecord, String> paymentStatusTableColumn;
    @FXML
    private TableColumn<PaymentRecord, String> paymentMethodTableColumn;


    private final ObservableList<PaymentRecord> paymentRecords = FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        vendorSelctionComboBox.setItems(FXCollections.observableArrayList("Vendor A", "Vendor B", "Vendor C"));
        paymentMethodComboBox.setItems(FXCollections.observableArrayList("Bank Transfer", "Cheque", "Cash"));


        invoiceNumTableColumn.setCellValueFactory(data -> data.getValue().invoiceNumberProperty());
        vendorNameTableColumn.setCellValueFactory(data -> data.getValue().vendorNameProperty());
        invoiceDateTableColumn.setCellValueFactory(data -> data.getValue().invoiceDateProperty());
        dueDateTableColumn.setCellValueFactory(data -> data.getValue().dueDateProperty());
        amountTableColumn.setCellValueFactory(data -> data.getValue().paymentAmountProperty().asObject());
        paymentStatusTableColumn.setCellValueFactory(data -> data.getValue().paymentStatusProperty());
        paymentMethodTableColumn.setCellValueFactory(data -> data.getValue().paymentMethodProperty());
        manageAccountsPayableTableView.setItems(paymentRecords);
    }

    @FXML
    private void processPaymentButtonOnAction(ActionEvent event) {
        try {
            String vendor = vendorSelctionComboBox.getValue();
            String invoiceNumber = invoiceNumberTextField.getText();
            double paymentAmount = Double.parseDouble(paymentAmmountTextField.getText());
            LocalDate paymentDate = paymentDatePicker.getValue();
            LocalDate dueDate = invoiceDueDatePicker.getValue();
            String paymentMethod = paymentMethodComboBox.getValue();
            String transactionId = transactionIdTextField.getText();

            if (vendor == null || paymentMethod == null || invoiceNumber.isEmpty() || paymentDate == null || dueDate == null || transactionId.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Input Error", "Please fill out all required fields.");
                return;
            }

            PaymentRecord record = new PaymentRecord(invoiceNumber, vendor, LocalDate.now(), dueDate, paymentAmount, "Processed", paymentMethod);
            paymentRecords.add(record);

            showAlert(Alert.AlertType.INFORMATION, "Success", "Payment processed successfully!");
            resetFields();
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Payment amount must be a valid number.");
        }
    }

    @FXML
    private void showingTableviwButtonOnAction(ActionEvent event) {
        manageAccountsPayableTableView.refresh();
    }

    @FXML
    private void filterButtonOnAction(ActionEvent event) {
        String vendorFilter = vendorSelctionComboBox.getValue();
        if (vendorFilter != null) {
            ObservableList<PaymentRecord> filteredRecords = paymentRecords.filtered(record -> record.getVendorName().equals(vendorFilter));
            manageAccountsPayableTableView.setItems(filteredRecords);
        }
    }

    @FXML
    private void resetButtonOnAction(ActionEvent event) {
        resetFields();
        manageAccountsPayableTableView.setItems(paymentRecords);
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) manageAccPayableAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Back button clicked");
    }

    private void resetFields() {
        vendorSelctionComboBox.getSelectionModel().clearSelection();
        invoiceNumberTextField.clear();
        paymentAmmountTextField.clear();
        paymentDatePicker.setValue(null);
        invoiceDueDatePicker.setValue(null);
        paymentMethodComboBox.getSelectionModel().clearSelection();
        transactionIdTextField.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
