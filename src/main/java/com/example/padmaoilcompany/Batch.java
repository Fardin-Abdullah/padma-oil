package com.example.padmaoilcompany;

import java.time.LocalDate;

public class Batch {
    private String batchId;
    private String productType, status;
    private LocalDate creationDate;

    public Batch() {
    }

    public Batch(String batchId, String productType, String status, LocalDate creationDate) {
        this.batchId = batchId;
        this.productType = productType;
        this.status = status;
        this.creationDate = creationDate;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId='" + batchId + '\'' +
                ", productType='" + productType + '\'' +
                ", status='" + status + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}

