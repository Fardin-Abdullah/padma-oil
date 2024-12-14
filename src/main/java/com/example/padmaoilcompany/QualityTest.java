package com.example.padmaoilcompany;

import java.util.ArrayList;

public class QualityTest {
    private String testId, batchId;
    private ArrayList<String> authorList;
    ;
    private boolean status;

    public QualityTest() {
    }

    public QualityTest(String testId, String batchId, ArrayList<String> authorList, boolean status) {
        this.testId = testId;
        this.batchId = batchId;
        this.authorList = authorList;
        this.status = status;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<String> authorList) {
        this.authorList = authorList;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QualityTest{" +
                "testId='" + testId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", authorList=" + authorList +
                ", status=" + status +
                '}';
    }
}