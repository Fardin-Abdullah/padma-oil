package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ManageInventoryLevelsController
{
    @javafx.fxml.FXML
    private TableColumn CurrentStockQuantityInvertoryTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> itemnInvertoryComboBox;
    @javafx.fxml.FXML
    private DatePicker expectedDateInvertoryDatePicker;
    @javafx.fxml.FXML
    private TableView managingInventoryLevel1TableView;
    @javafx.fxml.FXML
    private ComboBox<String> supplierInvertoryComboBox;
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
    private ComboBox<String> qualityInvertoryComboBox;
    @javafx.fxml.FXML
    private AnchorPane managingInventoryLevelsAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        qualityInvertoryComboBox.getItems().addAll("1","2","3","4");
        supplierInvertoryComboBox.getItems().addAll("a","b","c","d");
        itemnInvertoryComboBox.getItems().addAll("desel","kerosin","b","c");
    }

    @javafx.fxml.FXML
    public void confirmOrderSubmissionButtonOnAction(ActionEvent actionEvent) {
        String item = itemnInvertoryComboBox.getValue();
        String supplier = supplierInvertoryComboBox.getValue();
        String quality = qualityInvertoryComboBox.getValue();
        LocalDate expectedDate = expectedDateInvertoryDatePicker.getValue();

        if (item == null || supplier == null || quality == null || expectedDate == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all fields.");
            alert.show();
            return;
        }

        System.out.println("Order Submission:");
        System.out.println("Item: " + item);
        System.out.println("Supplier: " + supplier);
        System.out.println("Quality: " + quality);
        System.out.println("Expected Delivery Date: " + expectedDate);

        itemnInvertoryComboBox.setValue(null);
        supplierInvertoryComboBox.setValue(null);
        qualityInvertoryComboBox.setValue(null);
        expectedDateInvertoryDatePicker.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Order submitted successfully!");
        alert.show();
    }

    @javafx.fxml.FXML
    public void backInventoryButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ManageInventoryLevelsController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)managingInventoryLevelsAnchorPane.getScene().getWindow();
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}