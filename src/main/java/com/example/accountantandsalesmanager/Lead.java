package com.example.accountantandsalesmanager;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Lead {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty company;
    private final StringProperty contactInfo;
    private final StringProperty budget;
    private final StringProperty decisionMaker;
    private final StringProperty status;

    public Lead(String id, String name, String company, String contactInfo, String budget, String decisionMaker, String status) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.company = new SimpleStringProperty(company);
        this.contactInfo = new SimpleStringProperty(contactInfo);
        this.budget = new SimpleStringProperty(budget);
        this.decisionMaker = new SimpleStringProperty(decisionMaker);
        this.status = new SimpleStringProperty(status);
    }

    public StringProperty idProperty() {
        return id;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty companyProperty() {
        return company;
    }

    public StringProperty contactInfoProperty() {
        return contactInfo;
    }

    public StringProperty budgetProperty() {
        return budget;
    }

    public StringProperty decisionMakerProperty() {
        return decisionMaker;
    }

    public StringProperty statusProperty() {
        return status;
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getCompany() {
        return company.get();
    }

    public String getContactInfo() {
        return contactInfo.get();
    }

    public String getBudget() {
        return budget.get();
    }

    public String getDecisionMaker() {
        return decisionMaker.get();
    }

    public String getStatus() {
        return status.get();
    }

    public void setBudget(String budget) {
        this.budget.set(budget);
    }

    public void setDecisionMaker(String decisionMaker) {
        this.decisionMaker.set(decisionMaker);
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}
