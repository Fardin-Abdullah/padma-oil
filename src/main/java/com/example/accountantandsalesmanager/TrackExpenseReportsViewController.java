package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TrackExpenseReportsViewController
{
    @javafx.fxml.FXML
    private TableColumn submissionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn reportIdTableColumn;
    @javafx.fxml.FXML
    private ComboBox departmentorProjectComboBox;
    @javafx.fxml.FXML
    private TextField expenseManagementTextField;
    @javafx.fxml.FXML
    private TableColumn departmentTableColumn;
    @javafx.fxml.FXML
    private TableView trackExpenseReportsTableView;
    @javafx.fxml.FXML
    private TableColumn totalAmmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn actionButtonTableColumn;
    @javafx.fxml.FXML
    private TableColumn submittedbyTableColumn;
    @javafx.fxml.FXML
    private AnchorPane trackExpenseReportAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showTablViewOfTrackEXpenseButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)trackExpenseReportAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}