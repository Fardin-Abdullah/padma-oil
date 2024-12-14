package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ScheduleDeliveriesController
{
    @javafx.fxml.FXML
    private TableColumn deliveryDeadlineScheduleTableColumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusScheduleTableColumn;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDatePicker;
    @javafx.fxml.FXML
    private TextField deliveryTimeScheduleTextField;
    @javafx.fxml.FXML
    private TableColumn orderIdScheduleTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectedDeliveriesScheduleComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> deliveryMethodScheduleComboBox;
    @javafx.fxml.FXML
    private TableColumn destinationScheduleTableColumn;
    @javafx.fxml.FXML
    private TableView scheduleDeliveryTableView;
    @javafx.fxml.FXML
    private AnchorPane scheduleDeliveriesAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        deliveryMethodScheduleComboBox.getItems().addAll("A","B","C","D");
        selectedDeliveriesScheduleComboBox.getItems().addAll("airway","By road");
    }

    @javafx.fxml.FXML
    public void ComfirmScheduleScheduleButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backDeliveriesButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ScheduleDeliveriesController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)scheduleDeliveriesAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}