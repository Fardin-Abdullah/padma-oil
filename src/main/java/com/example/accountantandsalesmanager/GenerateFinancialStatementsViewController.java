package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GenerateFinancialStatementsViewController
{
    @javafx.fxml.FXML
    private TableView financialStatementsTableView;
    @javafx.fxml.FXML
    private DatePicker EndDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private AnchorPane generateFinancialStatementsAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void financialReportGenerateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void financialStatementsTableButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)generateFinancialStatementsAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}