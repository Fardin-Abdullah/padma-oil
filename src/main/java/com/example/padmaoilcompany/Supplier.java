package com.example.padmaoilcompany;

import java.util.ArrayList;

public class Supplier {
    private String supplierID;
    private String supplierName;
    private ArrayList<String> auditdata;

    public Supplier() {
    }

    public Supplier(String supplierID, String supplierName, ArrayList<String> auditdata) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.auditdata = auditdata;
    }


    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ArrayList<String> getAuditdata() {
        return auditdata;
    }

    public void setAuditdata(ArrayList<String> auditdata) {
        this.auditdata = auditdata;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID='" + supplierID + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", auditdata=" + auditdata +
                '}';
    }
}
