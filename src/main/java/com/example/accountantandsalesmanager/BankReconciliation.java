package com.example.accountantandsalesmanager;

import java.util.ArrayList;

public class BankReconciliation {
    private String accountId;
    private ArrayList<Transaction> bankTransactions;
    private ArrayList<Transaction> ledgerTransactions;
    private boolean isReconciled;

    public BankReconciliation() {
    }

    public BankReconciliation(String accountId, ArrayList<Transaction> bankTransactions, ArrayList<Transaction> ledgerTransactions, boolean isReconciled) {
        this.accountId = accountId;
        this.bankTransactions = bankTransactions;
        this.ledgerTransactions = ledgerTransactions;
        this.isReconciled = isReconciled;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ArrayList<Transaction> getBankTransactions() {
        return bankTransactions;
    }

    public void setBankTransactions(ArrayList<Transaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public ArrayList<Transaction> getLedgerTransactions() {
        return ledgerTransactions;
    }

    public void setLedgerTransactions(ArrayList<Transaction> ledgerTransactions) {
        this.ledgerTransactions = ledgerTransactions;
    }

    public boolean isReconciled() {
        return isReconciled;
    }

    public void setReconciled(boolean reconciled) {
        isReconciled = reconciled;
    }

    @Override
    public String toString() {
        return "BankReconciliation{" +
                "accountId='" + accountId + '\'' +
                ", bankTransactions=" + bankTransactions +
                ", ledgerTransactions=" + ledgerTransactions +
                ", isReconciled=" + isReconciled +
                '}';
    }
}
