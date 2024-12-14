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

public class QualifySalesLeadViewController
{
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn companyTableColumn;
    @javafx.fxml.FXML
    private ComboBox leadStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn leadIdTableColumn;
    @javafx.fxml.FXML
    private TableView leadQualificationTableView;
    @javafx.fxml.FXML
    private TableColumn contactInfoTableColumn;
    @javafx.fxml.FXML
    private TextField decisionMakerTextField;
    @javafx.fxml.FXML
    private AnchorPane qualifySalesLeadAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void selectLeadButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualifySalesLeadAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}