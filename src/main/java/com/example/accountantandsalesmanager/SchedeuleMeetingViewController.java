package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class SchedeuleMeetingViewController
{
    @javafx.fxml.FXML
    private TableView shedulemeetingTableView;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn timeTableColumn;
    @javafx.fxml.FXML
    private AnchorPane selectionleadClientComboBox;
    @javafx.fxml.FXML
    private TableColumn clientNameTableColumn;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveMeetingButtonOnAction(ActionEvent actionEvent) {
    }
}