package padmaOilCompany.supplyChainManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
    }
}