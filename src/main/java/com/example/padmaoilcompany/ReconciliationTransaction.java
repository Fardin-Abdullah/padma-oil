package com.example.padmaoilcompany;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ReconciliationTransaction {


    private StringProperty date;
    private StringProperty description;
    private StringProperty amount;
    private StringProperty status;


    private StringProperty transactionId;
    private StringProperty bankAccount;
    private StringProperty bankStatementDate;


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


    public void setStatus(String status) {
        this.status.set(status);
    }
}
