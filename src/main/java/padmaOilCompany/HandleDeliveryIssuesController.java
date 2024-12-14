package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HandleDeliveryIssuesController
{

    @javafx.fxml.FXML
    private TableColumn deliveryStatusIssuesTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> issueTypeIssuesComboBox;
    @javafx.fxml.FXML
    private TableColumn shipmmentIdIssuesTableColumn;
    @javafx.fxml.FXML
    private TextField describtionTextField;
    @javafx.fxml.FXML
    private TableColumn scheduledDeliveryTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> shipmentIdIssuesComboBox;
    @javafx.fxml.FXML
    private TableColumn destinationIssuesTableColmn;
    @javafx.fxml.FXML
    private TableView deliveryIssuesTableView;
    @javafx.fxml.FXML
    private AnchorPane reportDeliveryIssuesAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        issueTypeIssuesComboBox.getItems().addAll("packaging","Delay","spoiled","wastage");
        shipmentIdIssuesComboBox.getItems().addAll("2321118","232210","221002","212234");

    }

    @Deprecated
    public void jhvyh(Event event) {
    }
    @javafx.fxml.FXML
    public void submitIssueResolutionButtonOnAction(ActionEvent actionEvent) {
        String issueType = issueTypeIssuesComboBox.getValue();
        String shipmentId = shipmentIdIssuesComboBox.getValue();
        String description = describtionTextField.getText();

        System.out.println("Submitting issue resolution:");
        System.out.println("Issue Type: " + issueType);
        System.out.println("Shipment ID: " + shipmentId);
        System.out.println("Description: " + description);

        issueTypeIssuesComboBox.setValue(null);
        shipmentIdIssuesComboBox.setValue(null);
        describtionTextField.clear();

    }

    @javafx.fxml.FXML
    public void showDelayDeliiveryButtonOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backIssuesButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HandleDeliveryIssuesController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)reportDeliveryIssuesAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Back Button");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}