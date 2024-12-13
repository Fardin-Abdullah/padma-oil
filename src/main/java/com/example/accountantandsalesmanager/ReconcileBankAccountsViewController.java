package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReconcileBankAccountsViewController
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn amountTableColumn;
    @javafx.fxml.FXML
    private TextField transactionIdTextField;
    @javafx.fxml.FXML
    private TableView reconcileBankAccountsTableView;
    @javafx.fxml.FXML
    private ComboBox bankAccountComboBox;
    @javafx.fxml.FXML
    private TableColumn descriptionTableColumn;
    @javafx.fxml.FXML
    private DatePicker bankStatementDatePicker;
    @javafx.fxml.FXML
    private AnchorPane reconcileBankAccountsAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void reconcileTransactionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateAndSaveButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dateTableColumn(Event event) {
    }

    @javafx.fxml.FXML
    public void showTableViewOfHistoryTransactionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)reconcileBankAccountsAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}