package com.example.accountantandsalesmanager;

import javafx.beans.property.*;
import java.time.LocalDate;

public class Invoice {
    private final StringProperty invoiceNumber;
    private final StringProperty customerName;
    private final DoubleProperty amount;
    private final ObjectProperty<LocalDate> dueDate;
    private final StringProperty paymentStatus;

    public Invoice() {
        this.invoiceNumber = new SimpleStringProperty();
        this.customerName = new SimpleStringProperty();
        this.amount = new SimpleDoubleProperty();
        this.dueDate = new SimpleObjectProperty<>();
        this.paymentStatus = new SimpleStringProperty();
    }

    public Invoice(String invoiceNumber, String customerName, double amount, LocalDate dueDate, String paymentStatus) {
        this.invoiceNumber = new SimpleStringProperty(invoiceNumber);
        this.customerName = new SimpleStringProperty(customerName);
        this.amount = new SimpleDoubleProperty(amount);
        this.dueDate = new SimpleObjectProperty<>(dueDate);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
    }

    public String getInvoiceNumber() {
        return invoiceNumber.get();
    }

    public StringProperty invoiceNumberProperty() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public StringProperty customerNameProperty() {
        return customerName;
    }

    public double getAmount() {
        return amount.get();
    }

    public DoubleProperty amountProperty() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate.get();
    }

    public ObjectProperty<LocalDate> dueDateProperty() {
        return dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus.get();
    }

    public StringProperty paymentStatusProperty() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber.get() +
                ", customerName=" + customerName.get() +
                ", amount=" + amount.get() +
                ", dueDate=" + dueDate.get() +
                ", paymentStatus=" + paymentStatus.get() +
                '}';
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus.set(paymentStatus);
    }

    public void setAmount(double amount) {
        this.amount.set(amount);
    }
}
