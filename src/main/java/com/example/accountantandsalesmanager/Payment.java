package com.example.accountantandsalesmanager;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private String type;
    private String entityName;
    private double amount;
    private LocalDate dueDate;
    private boolean resolved;

    public Payment() {
    }

    public Payment(String paymentId, String type, String entityName, double amount, LocalDate dueDate, boolean resolved) {
        this.paymentId = paymentId;
        this.type = type;
        this.entityName = entityName;
        this.amount = amount;
        this.dueDate = dueDate;
        this.resolved = resolved;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public void processPayment() {
        this.resolved = true;
        System.out.println("Payment processed for: " + entityName);
    }

    public void recordPayment() {
        System.out.println("Payment recorded: " + this);

    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", type='" + type + '\'' +
                ", entityName='" + entityName + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", resolved=" + resolved +
                '}';
    }
}
