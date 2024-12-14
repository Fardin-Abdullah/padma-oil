package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ManageAccountsReceivableViewController
{
    @javafx.fxml.FXML
    private TableColumn<Invoice, String> customerNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Invoice, Double> amountTableColumn;
    @javafx.fxml.FXML
    private TextField invoiceNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<Invoice, String> paymentStatusTableColumn;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableView<Invoice> manageAccountsPayableTableView;
    @javafx.fxml.FXML
    private TableColumn<Invoice, LocalDate> invoiceDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker invoiceDueDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> customerSelectionComboBox;
    @javafx.fxml.FXML
    private TableColumn<Invoice, LocalDate> dueDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Invoice, String> invoiceNumberTableColumn;
    @javafx.fxml.FXML
    private AnchorPane manageAccReceivableAnchorPane;

    private ObservableList<Invoice> invoiceList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        customerSelectionComboBox.setItems(FXCollections.observableArrayList("Customer 1", "Customer 2", "Customer 3"));

        invoiceNumberTableColumn.setCellValueFactory(cellData -> cellData.getValue().invoiceNumberProperty());
        customerNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().customerNameProperty());
        amountTableColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty().asObject()); // Use asObject for DoubleProperty
        dueDateTableColumn.setCellValueFactory(cellData -> cellData.getValue().dueDateProperty());
        paymentStatusTableColumn.setCellValueFactory(cellData -> cellData.getValue().paymentStatusProperty());
    }

    @javafx.fxml.FXML
    public void resetButtonOnAction(ActionEvent actionEvent) {

        invoiceNumberTextField.clear();
        amountTextField.clear();
        invoiceDueDatePicker.setValue(null);
        customerSelectionComboBox.setValue(null);
    }

    @javafx.fxml.FXML
    public void recordPaymentButtonOnAction(ActionEvent actionEvent) {

        String invoiceNumber = invoiceNumberTextField.getText();
        String amountStr = amountTextField.getText();
        String customerName = customerSelectionComboBox.getValue();
        String paymentStatus = "Paid";
        if (invoiceNumber.isEmpty() || amountStr.isEmpty() || customerName == null) {

            showAlert("Error", "Please fill in all the fields.");
            return;
        }

        double amount = Double.parseDouble(amountStr);


        Invoice selectedInvoice = null;
        for (Invoice invoice : invoiceList) {
            if (invoice.getInvoiceNumber().equals(invoiceNumber)) {
                selectedInvoice = invoice;
                break;
            }
        }

        if (selectedInvoice != null) {
            selectedInvoice.setPaymentStatus(paymentStatus);
            selectedInvoice.setAmount(amount);  // Update amount if necessary
            manageAccountsPayableTableView.refresh();  // Refresh the table
            showAlert("Success", "Payment recorded successfully.");
        } else {
            showAlert("Error", "Invoice not found.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) manageAccReceivableAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {

        String filter = invoiceNumberTextField.getText();
        ObservableList<Invoice> filteredList = FXCollections.observableArrayList();

        for (Invoice invoice : invoiceList) {
            if (invoice.getInvoiceNumber().contains(filter)) {
                filteredList.add(invoice);
            }
        }

        manageAccountsPayableTableView.setItems(filteredList);
    }

    @javafx.fxml.FXML
    public void showTableButtonOnAction(ActionEvent actionEvent) {

        manageAccountsPayableTableView.setItems(invoiceList);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
