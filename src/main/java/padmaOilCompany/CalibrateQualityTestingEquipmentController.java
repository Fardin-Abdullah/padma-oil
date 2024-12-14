package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CalibrateQualityTestingEquipmentController
{
    @javafx.fxml.FXML
    private CheckBox prepareEquipment1CheckBox;
    @javafx.fxml.FXML
    private TextField calibrationDateCalibrationTextField;
    @javafx.fxml.FXML
    private TextField initialReadingCalibrationTextField;
    @javafx.fxml.FXML
    private ComboBox eqipmentCalibrationComboBox;
    @javafx.fxml.FXML
    private TextField deviceCalibrationTextField;
    @javafx.fxml.FXML
    private CheckBox prepareEquipment2CheckBox;
    @javafx.fxml.FXML
    private ComboBox calibrationStanderdsCalibrationComboBox;
    @javafx.fxml.FXML
    private ComboBox calibrationCalibrationComboBox;
    @javafx.fxml.FXML
    private TextField enterAdjustmentCalibrationTextField;
    @javafx.fxml.FXML
    private AnchorPane calibrationSectionAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyAccuarcyNOButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void startCalibrationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmDataCalibrationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void calibrationStandardsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmAdjustmentCalibrationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyAccuracyYESButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backCalibrationButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(CalibrateQualityTestingEquipmentController.class.getResource("/padmaOilCompany/QualityControlManager/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)calibrationSectionAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}