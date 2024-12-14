package com.example.accountantandsalesmanager;

import javafx.beans.property.*;
import java.time.LocalDate;

public class Invoice {
    private final StringProperty invoiceNumber;
    private final StringProperty customerName;
    private final DoubleProperty amount;
    private final ObjectProperty<LocalDate> dueDate;
    private final StringProperty paymentStatus;

    // Constructor
    public Invoice(String invoiceNumber, String customerName, double amount, LocalDate dueDate, String paymentStatus) {
        this.invoiceNumber = new SimpleStringProperty(invoiceNumber);
        this.customerName = new SimpleStringProperty(customerName);
        this.amount = new SimpleDoubleProperty(amount);
        this.dueDate = new SimpleObjectProperty<>(dueDate);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
    }

    // Getters and setters
    public String getInvoiceNumber() {
        return invoiceNumber.get();
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber.set(invoiceNumber);
    }

    public StringProperty invoiceNumberProperty() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public void setCustomerName(String customerName) {
        this.customerName.set(customerName);
    }

    public StringProperty customerNameProperty() {
        return customerName;
    }

    public double getAmount() {
        return amount.get();
    }

    public void setAmount(double amount) {
        this.amount.set(amount);
    }

    public DoubleProperty amountProperty() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate.get();
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate.set(dueDate);
    }

    public ObjectProperty<LocalDate> dueDateProperty() {
        return dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus.get();
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus.set(paymentStatus);
    }

    public StringProperty paymentStatusProperty() {
        return paymentStatus;
    }

    // Optional: To string for easy printing
    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber.get() + '\'' +
                ", customerName='" + customerName.get() + '\'' +
                ", amount=" + amount.get() +
                ", dueDate=" + dueDate.get() +
                ", paymentStatus='" + paymentStatus.get() + '\'' +
                '}';
    }
}
