package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class MHoldMeetingsViewController
{

    @javafx.fxml.FXML
    private TextField meetingTitleTextField;
    @javafx.fxml.FXML
    private DatePicker meetingDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleMeetingButtonOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText("Meetings Are Unavailable At This Moment!");
        alert.showAndWait();
    }
}