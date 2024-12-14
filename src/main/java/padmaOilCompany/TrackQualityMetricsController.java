package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class TrackQualityMetricsController
{
    @javafx.fxml.FXML
    private TableColumn improvementRate2TableColumn;
    @javafx.fxml.FXML
    private Tab previousPerformanceTabPane;
    @javafx.fxml.FXML
    private Tab newPerformanceTabPane;
    @javafx.fxml.FXML
    private ComboBox<String> batchIdQualityMetricsComboBox;
    @javafx.fxml.FXML
    private DatePicker periodEndsQualityMetricsDatePicker;
    @javafx.fxml.FXML
    private RadioButton lastQuarterRadioButton;
    @javafx.fxml.FXML
    private TableColumn defectsPerBatch2TableColumn;
    @javafx.fxml.FXML
    private DatePicker periodStartsQualityMetricsDatePicker;
    @javafx.fxml.FXML
    private RadioButton last7DayRadioButton;
    @javafx.fxml.FXML
    private TableColumn improvementRate1TableColumn;
    @javafx.fxml.FXML
    private TableColumn averageQualityScore2TableColumn;
    @javafx.fxml.FXML
    private RadioButton lastMonthRadioButton;
    @javafx.fxml.FXML
    private RadioButton customRangeRadioButton;
    @javafx.fxml.FXML
    private TableColumn defectsPerBatch1TableColumn;
    @javafx.fxml.FXML
    private TableColumn averageQualityScore1TableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> productQualityMetricsComboBox;
    @javafx.fxml.FXML
    private Label QualityMetrics;
    @javafx.fxml.FXML
    private AnchorPane trackQualityMetricAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        batchIdQualityMetricsComboBox.getItems().addAll("1","2","3","4");
        productQualityMetricsComboBox.getItems().addAll("5","6","7","8");

    }

    @javafx.fxml.FXML
    public void searchQualityMetricsButtonOnAction(ActionEvent actionEvent) {
        String batchId = batchIdQualityMetricsComboBox.getValue();
        String product = productQualityMetricsComboBox.getValue();
        LocalDate startDate = periodStartsQualityMetricsDatePicker.getValue();
        LocalDate endDate = periodEndsQualityMetricsDatePicker.getValue();

        if (isInputInvalid(batchId, product, startDate, endDate)) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please select all required fields.");
            return;
        }

        String qualityMetrics = retrieveQualityMetrics(batchId, product, startDate, endDate);
        showAlert(Alert.AlertType.INFORMATION, "Quality Metrics", qualityMetrics);
    }

    private boolean isInputInvalid(String batchId, String product, LocalDate startDate, LocalDate endDate) {
        return batchId == null || product == null || startDate == null || endDate == null;
    }

    private String retrieveQualityMetrics(String batchId, String product, LocalDate startDate, LocalDate endDate) {
        return "Quality Metrics for Batch " + batchId + " and Product " + product + ":\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n" +
                "Average Quality Score: 85\n" +
                "Defects Per Batch: 2\n" +
                "Improvement Rate: 5%";
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @javafx.fxml.FXML
    public void downloadPerformanceQualityMetricsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backMetricsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(TrackQualityMetricsController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)trackQualityMetricAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}