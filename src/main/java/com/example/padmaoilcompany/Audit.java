package com.example.padmaoilcompany;

import java.util.ArrayList;

public class Audit {
    private String AuditId, SupplierId, findings;
    private ArrayList<String> CheckList;

    public Audit() {
    }

    public Audit(String auditId, String supplierId, String findings, ArrayList<String> checkList) {
        AuditId = auditId;
        SupplierId = supplierId;
        this.findings = findings;
        CheckList = checkList;
    }

    public String getAuditId() {
        return AuditId;
    }

    public void setAuditId(String auditId) {
        AuditId = auditId;
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String supplierId) {
        SupplierId = supplierId;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    public ArrayList<String> getCheckList() {
        return CheckList;
    }

    public void setCheckList(ArrayList<String> checkList) {
        CheckList = checkList;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "AuditId='" + AuditId + '\'' +
                ", SupplierId='" + SupplierId + '\'' +
                ", findings='" + findings + '\'' +
                ", CheckList=" + CheckList +
                '}';
    }
}
