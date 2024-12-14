package com.example.accountantandsalesmanager;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Lead {
    private final StringProperty leadId;
    private final StringProperty name;
    private final StringProperty contactInfo;
    private final StringProperty company;

    // Constructor
    public Lead(String name, String contactInfo, String company) {
        this.leadId = new SimpleStringProperty("L" + System.currentTimeMillis()); // Generate a unique ID
        this.name = new SimpleStringProperty(name);
        this.contactInfo = new SimpleStringProperty(contactInfo);
        this.company = new SimpleStringProperty(company);
    }

    // Getters for the properties
    public String getLeadId() {
        return leadId.get();
    }

    public void setLeadId(String leadId) {
        this.leadId.set(leadId);
    }

    public StringProperty leadIdProperty() {
        return leadId;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo.get();
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo.set(contactInfo);
    }

    public StringProperty contactInfoProperty() {
        return contactInfo;
    }

    public String getCompany() {
        return company.get();
    }

    public void setCompany(String company) {
        this.company.set(company);
    }

    public StringProperty companyProperty() {
        return company;
    }

    @Override
    public String toString() {
        return "Lead ID: " + leadId.get() + ", Name: " + name.get() + ", Company: " + company.get() + ", Contact: " + contactInfo.get();
    }
}
