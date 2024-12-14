package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private ComboBox selectSuppliersComboBox;
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
    }

    @javafx.fxml.FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
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