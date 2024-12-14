package com.example.padmaoilcompany;

public class Inspection {
    private String batchId, inspectionId;
    private String findings;

    public Inspection() {
    }


    public Inspection(String batchId, String inspectionId, String findings) {
        this.batchId = batchId;
        this.inspectionId = inspectionId;
        this.findings = findings;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "batchId='" + batchId + '\'' +
                ", inspectionId='" + inspectionId + '\'' +
                ", findings='" + findings + '\'' +
                '}';
    }
}
