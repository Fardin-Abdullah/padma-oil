package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PrepareTaxFillingsViewController
{
    @javafx.fxml.FXML
    private TableColumn submissionDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private TableColumn taxTypeTableColumn;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TableColumn dueDateTableColumn;
    @javafx.fxml.FXML
    private ComboBox taxTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn actionButtonTableColumn;
    @javafx.fxml.FXML
    private TableColumn fillingIdTableColumn;
    @javafx.fxml.FXML
    private AnchorPane prepareTaxFillingAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addFillingDataButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void prepareTaxfillingsTableView(Event event) {
    }

    @javafx.fxml.FXML
    public void submitFillingButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)prepareTaxFillingAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}