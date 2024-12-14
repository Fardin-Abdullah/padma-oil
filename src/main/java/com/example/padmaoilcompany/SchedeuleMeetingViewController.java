package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SchedeuleMeetingViewController {

    @javafx.fxml.FXML
    private TableView<Meeting> shedulemeetingTableView;
    @javafx.fxml.FXML
    private TableColumn<Meeting, String> clientNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Meeting, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Meeting, LocalTime> timeTableColumn;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;
    @javafx.fxml.FXML
    private AnchorPane schedeuleMeetingAnchorPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectLeadCLientComboBox;

    private List<Meeting> meetingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        selectLeadCLientComboBox.getItems().addAll("Client 1", "Client 2", "Client 3");

        clientNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().clientNameProperty());
        dateTableColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        timeTableColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
    }

    @javafx.fxml.FXML
    public void saveMeetingButtonOnAction(ActionEvent actionEvent) {

        String selectedClient = selectLeadCLientComboBox.getValue();
        LocalDate meetingDate = dateDatepicker.getValue();
        LocalTime meetingTime = LocalTime.now();  // For now, assuming current time (could be extended for time picker)

        if (selectedClient != null && meetingDate != null) {

            Meeting newMeeting = new Meeting(selectedClient, meetingDate, meetingTime);


            meetingList.add(newMeeting);


            selectLeadCLientComboBox.setValue(null);
            dateDatepicker.setValue(null);


            System.out.println("Meeting saved for " + selectedClient + " on " + meetingDate + " at " + meetingTime);
        } else {

            System.out.println("Please select a client and a date for the meeting.");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) schedeuleMeetingAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void showTableButtonOnAction(ActionEvent actionEvent) {

        shedulemeetingTableView.getItems().setAll(meetingList);
    }
}
