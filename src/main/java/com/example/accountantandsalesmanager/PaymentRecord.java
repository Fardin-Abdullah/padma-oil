package com.example.accountantandsalesmanager;

import javafx.beans.property.*;

import java.time.LocalDate;

public class PaymentRecord {
    private final StringProperty invoiceNumber;
    private final StringProperty vendorName;
    private final ObjectProperty<LocalDate> invoiceDate;
    private final ObjectProperty<LocalDate> dueDate;
    private final DoubleProperty paymentAmount;
    private final StringProperty paymentStatus;
    private final StringProperty paymentMethod;

    public PaymentRecord(String invoiceNumber, String vendorName, LocalDate invoiceDate, LocalDate dueDate,
                         double paymentAmount, String paymentStatus, String paymentMethod) {
        this.invoiceNumber = new SimpleStringProperty(invoiceNumber);
        this.vendorName = new SimpleStringProperty(vendorName);
        this.invoiceDate = new SimpleObjectProperty<>(invoiceDate);
        this.dueDate = new SimpleObjectProperty<>(dueDate);
        this.paymentAmount = new SimpleDoubleProperty(paymentAmount);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
        this.paymentMethod = new SimpleStringProperty(paymentMethod);
    }

    // Getters and setters for properties
    public StringProperty invoiceNumberProperty() { return invoiceNumber; }
    public StringProperty vendorNameProperty() { return vendorName; }
    public ObjectProperty<LocalDate> invoiceDateProperty() { return invoiceDate; }
    public ObjectProperty<LocalDate> dueDateProperty() { return dueDate; }
    public DoubleProperty paymentAmountProperty() { return paymentAmount; }
    public StringProperty paymentStatusProperty() { return paymentStatus; }
    public StringProperty paymentMethodProperty() { return paymentMethod; }

    public String getVendorName() { return vendorName.get(); }
}
