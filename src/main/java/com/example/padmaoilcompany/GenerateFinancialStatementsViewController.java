package com.example.padmaoilcompany;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;

public class GenerateFinancialStatementsViewController {

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker EndDatePicker;

    @FXML
    private TableView<FinancialStatementEntry> financialStatementsTableView;

    @FXML
    private TableColumn<FinancialStatementEntry, String> reportTypeTableColumn;

    @FXML
    private TableColumn<FinancialStatementEntry, String> dateRangeTableColumn;

    @FXML
    private AnchorPane generateFinancialStatementsAnchorPane;

    private ObservableList<FinancialStatementEntry> financialStatementsData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        reportTypeComboBox.setItems(FXCollections.observableArrayList("Balance Sheet", "Income Statement", "Cash Flow Statement"));
        reportTypeTableColumn.setCellValueFactory(data -> data.getValue().reportTypeProperty());
        dateRangeTableColumn.setCellValueFactory(data -> data.getValue().dateRangeProperty());

        financialStatementsTableView.setItems(financialStatementsData);
    }

    @FXML
    private void financialStatementsTableButtonOnAction() {

        financialStatementsData.clear();
        financialStatementsData.add(new FinancialStatementEntry("Balance Sheet", "2024-01-01 to 2024-12-31"));
        financialStatementsData.add(new FinancialStatementEntry("Income Statement", "2024-01-01 to 2024-12-31"));
        System.out.println("Financial Statements Table populated.");
    }

    @FXML
    private void financialReportGenerateButtonOnAction() {

        String reportType = reportTypeComboBox.getValue();
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = EndDatePicker.getValue();

        if (reportType == null || startDate == null || endDate == null) {
            System.out.println("Please fill all the fields!");
            return;
        }


        String dateRange = startDate + " to " + endDate;
        financialStatementsData.add(new FinancialStatementEntry(reportType, dateRange));
        System.out.println("Financial report generated for: " + reportType + ", Date Range: " + dateRange);
    }

    @FXML
    private void exportReportButtonOnAction() {
        if (financialStatementsData.isEmpty()) {
            System.out.println("No data to export!");
            return;
        }


        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save CSV Report");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File csvFile = fileChooser.showSaveDialog(null);

        if (csvFile == null) {
            System.out.println("Export cancelled.");
            return;
        }


        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Report Type,Date Range\n");
            for (FinancialStatementEntry entry : financialStatementsData) {
                writer.append(entry.getReportType()).append(",").append(entry.getDateRange()).append("\n");
            }
            System.out.println("CSV report exported successfully to: " + csvFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Error exporting CSV: " + e.getMessage());
        }
    }

    @FXML
    private void backButtonOnAction() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) generateFinancialStatementsAnchorPane.getScene().getWindow();
            tempStage.setTitle("Accountant Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException("Failed to navigate back to Accountant Dashboard.", e);
        }
    }

    @FXML
    private void clearButtonOnAction() {

        reportTypeComboBox.setValue(null);
        startDatePicker.setValue(null);
        EndDatePicker.setValue(null); // Fixed this line
        financialStatementsData.clear();
        System.out.println("Fields and table cleared.");
    }
}
