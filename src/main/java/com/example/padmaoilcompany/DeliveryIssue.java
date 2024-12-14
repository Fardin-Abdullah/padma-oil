package com.example.padmaoilcompany;

public class DeliveryIssue {
    private String shipmentId;
    private String issueType;
    private String description;


    public DeliveryIssue() {
    }

    public DeliveryIssue(String shipmentId, String issueType, String description) {
        this.shipmentId = shipmentId;
        this.issueType = issueType;
        this.description = description;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DeliveryIssue{" +
                "shipmentId='" + shipmentId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
