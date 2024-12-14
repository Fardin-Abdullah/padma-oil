package com.example.padmaoilcompany;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.time.LocalTime;

public class Meeting {

    private final String clientName;
    private final LocalDate date;
    private final LocalTime time;

    public Meeting(String clientName, LocalDate date, LocalTime time) {
        this.clientName = clientName;
        this.date = date;
        this.time = time;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }


    public StringProperty clientNameProperty() {
        return new SimpleStringProperty(clientName);
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return new SimpleObjectProperty<>(date);
    }

    public ObjectProperty<LocalTime> timeProperty() {
        return new SimpleObjectProperty<>(time);
    }
}
