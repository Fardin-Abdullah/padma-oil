package com.example.accountantandsalesmanager;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ReconciliationTransaction {

    // Properties from Transaction
    private StringProperty date;
    private StringProperty description;
    private StringProperty amount;
    private StringProperty status;

    // Additional reconciliation-specific properties
    private StringProperty transactionId;
    private StringProperty bankAccount;
    private StringProperty bankStatementDate;

    // Constructor to initialize the data
    public ReconciliationTransaction(String date, String description, String amount, String status,
                                     String transactionId, String bankAccount, String bankStatementDate) {
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
        this.amount = new SimpleStringProperty(amount);
        this.status = new SimpleStringProperty(status);
        this.transactionId = new SimpleStringProperty(transactionId);
        this.bankAccount = new SimpleStringProperty(bankAccount);
        this.bankStatementDate = new SimpleStringProperty(bankStatementDate);
    }

    // Getters for JavaFX properties
    public StringProperty dateProperty() {
        return date;
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public StringProperty amountProperty() {
        return amount;
    }

    public StringProperty statusProperty() {
        return status;
    }

    public StringProperty transactionIdProperty() {
        return transactionId;
    }

    public StringProperty bankAccountProperty() {
        return bankAccount;
    }

    public StringProperty bankStatementDateProperty() {
        return bankStatementDate;
    }

    // Setters for the properties
    public void setStatus(String status) {
        this.status.set(status);
    }
}
