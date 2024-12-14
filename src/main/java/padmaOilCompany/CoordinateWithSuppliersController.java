package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CoordinateWithSuppliersController
{

    @javafx.fxml.FXML
    private TextField toTextfield;
    @javafx.fxml.FXML
    private TextField fromTextField;
    @javafx.fxml.FXML
    private TableColumn supplierNameTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectSuppliersComboBox;
    @javafx.fxml.FXML
    private TextField contextTextField;
    @javafx.fxml.FXML
    private TableColumn contactManagerTableColumn;
    @javafx.fxml.FXML
    private TableColumn lastContactDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn locationSupplierTableColumn;
    @javafx.fxml.FXML
    private TableView suppliersDetailsTableView;
    @javafx.fxml.FXML
    private AnchorPane coordinateWithSuppliersAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {

        selectSuppliersComboBox.getItems().addAll("A","B","C","D");
    }

    @javafx.fxml.FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
        String to = toTextfield.getText();
        String from = fromTextField.getText();
        String context = contextTextField.getText();
        String selectedSupplier = selectSuppliersComboBox.getValue();

        if (to.isEmpty() || from.isEmpty() || context.isEmpty() || selectedSupplier == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all fields and select a supplier.");
            alert.show();
            return;
        }

        System.out.println("Sending message to supplier:");
        System.out.println("To: " + to);
        System.out.println("From: " + from);
        System.out.println("Context: " + context);
        System.out.println("Selected Supplier: " + selectedSupplier);

        toTextfield.clear();
        fromTextField.clear();
        contextTextField.clear();
        selectSuppliersComboBox.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Message sent successfully!");
        alert.show();
    }


    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(CoordinateWithSuppliersController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)coordinateWithSuppliersAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Receivable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}