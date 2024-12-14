package com.example.accountantandsalesmanager;

import java.time.LocalDate;
import java.util.Map;

public class Report {
        private String reportId;
        private String type; // "Income Statement", "Balance Sheet"
        private LocalDate startDate;
        private LocalDate endDate;
        private Map<String, Double> data;

    public Report() {
    }

    public Report(String reportId, String type, LocalDate startDate, LocalDate endDate, Map<String, Double> data) {
        this.reportId = reportId;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.data = data;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Map<String, Double> getData() {
        return data;
    }

    public void setData(Map<String, Double> data) {
        this.data = data;
    }

    public void generateReport() {
        System.out.println("Generating report for: " + type);
        // Logic for fetching data and populating `data` map
    }

    public void exportReport(String format) {
        System.out.println("Exporting report to: " + format);
        // Logic to export data to the chosen format
    }


    @Override
    public String toString() {
        return "Report{" +
                "reportId='" + reportId + '\'' +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", data=" + data +
                '}';
    }
}
