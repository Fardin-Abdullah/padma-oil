package com.example.padmaoilcompany;

public class Complaint {
    private String complaintId, productId;
    private String description, Status;

    public Complaint() {
    }

    public Complaint(String complaintId, String productId, String description, String status) {
        this.complaintId = complaintId;
        this.productId = productId;
        this.description = description;
        Status = status;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId='" + complaintId + '\'' +
                ", productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}

