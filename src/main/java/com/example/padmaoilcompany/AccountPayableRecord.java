package com.example.padmaoilcompany;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class AccountPayableRecord {
    private final SimpleStringProperty invoiceNumber;
    private final SimpleStringProperty vendorName;
    private final SimpleStringProperty invoiceDate;
    private final SimpleStringProperty dueDate;
    private final SimpleStringProperty amount;
    private final SimpleStringProperty paymentStatus;
    private final SimpleStringProperty paymentMethod;

    public AccountPayableRecord(String invoiceNumber, String vendorName, String invoiceDate, String dueDate,
                                String amount, String paymentStatus, String paymentMethod) {
        this.invoiceNumber = new SimpleStringProperty(invoiceNumber);
        this.vendorName = new SimpleStringProperty(vendorName);
        this.invoiceDate = new SimpleStringProperty(invoiceDate);
        this.dueDate = new SimpleStringProperty(dueDate);
        this.amount = new SimpleStringProperty(amount);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
        this.paymentMethod = new SimpleStringProperty(paymentMethod);
    }

    public String getInvoiceNumber() {
        return invoiceNumber.get();
    }

    public void setInvoiceNumber(String value) {
        invoiceNumber.set(value);
    }

    public String getVendorName() {
        return vendorName.get();
    }

    public void setVendorName(String value) {
        vendorName.set(value);
    }

    public String getInvoiceDate() {
        return invoiceDate.get();
    }

    public void setInvoiceDate(String value) {
        invoiceDate.set(value);
    }

    public String getDueDate() {
        return dueDate.get();
    }

    public void setDueDate(String value) {
        dueDate.set(value);
    }

    public String getAmount() {
        return amount.get();
    }

    public void setAmount(String value) {
        amount.set(value);
    }

    public String getPaymentStatus() {
        return paymentStatus.get();
    }

    public void setPaymentStatus(String value) {
        paymentStatus.set(value);
    }

    public String getPaymentMethod() {
        return paymentMethod.get();
    }

    public void setPaymentMethod(String value) {
        paymentMethod.set(value);
    }

    public ObservableValue<String> amountProperty() {
    return amount;}

    public ObservableValue<String> paymentStatusProperty() {
    return paymentStatus;}

    public ObservableValue<String> dueDateProperty() {
    return dueDate;}

    public ObservableValue<String> invoiceDateProperty() {
    return invoiceDate; }

    public ObservableValue<String> vendorNameProperty() {
    return vendorName;}

    public ObservableValue<String> invoiceNumberProperty() {
    return invoiceNumber;}

    public ObservableValue<String> paymentMethodProperty() {
    return paymentMethod;}
}
