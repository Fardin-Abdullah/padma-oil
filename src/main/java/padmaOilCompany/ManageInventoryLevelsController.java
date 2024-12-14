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

public class ManageInventoryLevelsController
{
    @javafx.fxml.FXML
    private TableColumn CurrentStockQuantityInvertoryTableColumn;
    @javafx.fxml.FXML
    private ComboBox itemnInvertoryComboBox;
    @javafx.fxml.FXML
    private DatePicker expectedDateInvertoryDatePicker;
    @javafx.fxml.FXML
    private TableView managingInventoryLevel1TableView;
    @javafx.fxml.FXML
    private ComboBox supplierInvertoryComboBox;
    @javafx.fxml.FXML
    private TableColumn recorderLevelInvertoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn expectedDeliveryInvertoryTableColmn;
    @javafx.fxml.FXML
    private TableColumn lastOrderedQuantityInvertoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemnNameInvertoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn supplierInvertoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusInvertoryTableColumn;
    @javafx.fxml.FXML
    private TableView managingInventoryLevel2TableView;
    @javafx.fxml.FXML
    private ComboBox qualityInvertoryComboBox;
    @javafx.fxml.FXML
    private AnchorPane managingInventoryLevelsAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmOrderSubmissionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backInventoryButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ManageInventoryLevelsController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)managingInventoryLevelsAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}