package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SupplyChainReportsController
{
    @javafx.fxml.FXML
    private TableView supplyChainReportTableView;
    @javafx.fxml.FXML
    private TableColumn deliveryTimelineChainReportsTableColumn;
    @javafx.fxml.FXML
    private DatePicker startingPeriodChainReportsDatePicker;
    @javafx.fxml.FXML
    private TableColumn shipmentPerformanceChainReportsTableColumn;
    @javafx.fxml.FXML
    private DatePicker endingPeriodChainReportsDatePicker;
    @javafx.fxml.FXML
    private TableColumn suppliersPerformerChainReportTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectedReportingPeriodChainReportsComboBox;
    @javafx.fxml.FXML
    private TableColumn inventoryLevelsChainReportsTableColumn;
    @javafx.fxml.FXML
    private AnchorPane supplyChainReportAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        selectedReportingPeriodChainReportsComboBox.getItems().addAll("A","B","C","D");

    }

    @Deprecated
    public void alu(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportChainReportsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectAndProcessChainReportsBttonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backReportButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(SupplyChainReportsController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)supplyChainReportAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}