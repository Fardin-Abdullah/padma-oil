package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TrackQualityMetricsController
{
    @javafx.fxml.FXML
    private TableColumn improvementRate2TableColumn;
    @javafx.fxml.FXML
    private Tab previousPerformanceTabPane;
    @javafx.fxml.FXML
    private Tab newPerformanceTabPane;
    @javafx.fxml.FXML
    private ComboBox batchIdQualityMetricsComboBox;
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
    private ComboBox productQualityMetricsComboBox;
    @javafx.fxml.FXML
    private Label QualityMetrics;
    @javafx.fxml.FXML
    private AnchorPane trackQualityMetricAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchQualityMetricsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void downloadPerformanceQualityMetricsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backMetricsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(TrackQualityMetricsController.class.getResource("/padmaOilCompany/QualityControlManager/QualityControlManagerDashBoard.fxml"));
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