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

public class ReviewSupplierContractsController
{
    @javafx.fxml.FXML
    private TableColumn supplierInformationManagementTableColumn;
    @javafx.fxml.FXML
    private ComboBox chooseShipplierIdComboBox;
    @javafx.fxml.FXML
    private TableColumn contractStartsManagementTableColum;
    @javafx.fxml.FXML
    private ComboBox paymentTermManagementComboBox;
    @javafx.fxml.FXML
    private TableColumn contractDurationManagementTableColumn;
    @javafx.fxml.FXML
    private TableColumn supplierIdManagementTableColumn;
    @javafx.fxml.FXML
    private TableView contractManagementSystem1TableView;
    @javafx.fxml.FXML
    private DatePicker EndDateManagementDatePicker;
    @javafx.fxml.FXML
    private ComboBox terminationClauseManagementComboBox;
    @javafx.fxml.FXML
    private TableColumn paymentTermsManagementTableColmn;
    @javafx.fxml.FXML
    private TableColumn statusManagementTableColumn;
    @javafx.fxml.FXML
    private TableView contractManagementSystem2TableView;
    @javafx.fxml.FXML
    private TableColumn supplierNameManagementTableColumn;
    @javafx.fxml.FXML
    private TableColumn deliveryTermsManagementTableColumn;
    @javafx.fxml.FXML
    private TableColumn contractEndManagementTableColumn;
    @javafx.fxml.FXML
    private AnchorPane contractManagementSystemAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchSupplierButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveChangeManagementButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backManagementButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ReviewSupplierContractsController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)contractManagementSystemAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}