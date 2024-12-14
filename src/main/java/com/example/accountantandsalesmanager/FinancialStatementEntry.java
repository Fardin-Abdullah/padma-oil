package com.example.accountantandsalesmanager;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FinancialStatementEntry {
    private final StringProperty reportType;
    private final StringProperty dateRange;

    public FinancialStatementEntry(String reportType, String dateRange) {
        this.reportType = new SimpleStringProperty(reportType);
        this.dateRange = new SimpleStringProperty(dateRange);
    }

    public String getReportType() {
        return reportType.get();
    }

    public StringProperty reportTypeProperty() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType.set(reportType);
    }

    public String getDateRange() {
        return dateRange.get();
    }

    public StringProperty dateRangeProperty() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange.set(dateRange);
    }
}
