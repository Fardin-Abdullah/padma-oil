package com.example.padmaoilcompany;

import javafx.beans.property.*;

import java.time.LocalDate;

public class ReceivableRecord {
    private final StringProperty invoiceNumber;
    private final StringProperty customerName;
    private final ObjectProperty<LocalDate> invoiceDate;
    private final ObjectProperty<LocalDate> dueDate;
    private final DoubleProperty amount;
    private final StringProperty paymentStatus;

    public ReceivableRecord(String invoiceNumber, String customerName, LocalDate invoiceDate, LocalDate dueDate, double amount, String paymentStatus) {
        this.invoiceNumber = new SimpleStringProperty(invoiceNumber);
        this.customerName = new SimpleStringProperty(customerName);
        this.invoiceDate = new SimpleObjectProperty<>(invoiceDate);
        this.dueDate = new SimpleObjectProperty<>(dueDate);
        this.amount = new SimpleDoubleProperty(amount);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
    }


    public StringProperty invoiceNumberProperty() { return invoiceNumber; }
    public StringProperty customerNameProperty() { return customerName; }
    public ObjectProperty<LocalDate> invoiceDateProperty() { return invoiceDate; }
    public ObjectProperty<LocalDate> dueDateProperty() { return dueDate; }
    public DoubleProperty amountProperty() { return amount; }
    public StringProperty paymentStatusProperty() { return paymentStatus; }

    public String getCustomerName() { return customerName.get(); }
}
