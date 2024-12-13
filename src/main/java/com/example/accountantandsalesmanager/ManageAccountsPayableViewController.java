package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ManageAccountsPayableViewController
{
    @javafx.fxml.FXML
    private TableColumn amountTableColumn;
    @javafx.fxml.FXML
    private TableColumn vendorNameTableColumn;
    @javafx.fxml.FXML
    private TextField transactionIdTextField;
    @javafx.fxml.FXML
    private TableView manageAccountsPayableTableView;
    @javafx.fxml.FXML
    private TableColumn invoiceDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker invoiceDueDatePicker;
    @javafx.fxml.FXML
    private TextField invoiceNumberTextField;
    @javafx.fxml.FXML
    private TableColumn invoiceNumTableColumn;
    @javafx.fxml.FXML
    private TableColumn paymentStatusTableColumn;
    @javafx.fxml.FXML
    private ComboBox vendorSelctionComboBox;
    @javafx.fxml.FXML
    private TableColumn dueDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableColumn paymentMethodTableColumn;
    @javafx.fxml.FXML
    private TextField paymentAmmountTextField;
    @javafx.fxml.FXML
    private AnchorPane manageAccPayableAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void processPaymentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showingTableviwButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)manageAccPayableAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}