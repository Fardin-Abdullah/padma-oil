package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RecordFinancialTransactionViewController
{
    @javafx.fxml.FXML
    private ComboBox transactionTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn amountTableColumn;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private DatePicker transactionDatePicker;
    @javafx.fxml.FXML
    private TableColumn transactionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn transactionTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView financialTransaxtionTableView;
    @javafx.fxml.FXML
    private TableColumn descriptionTableColumn;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TableColumn paymentMethodTableColumn;
    @javafx.fxml.FXML
    private AnchorPane recordFinancialTransactionAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showTableViewTransactionHistoryButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)recordFinancialTransactionAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}