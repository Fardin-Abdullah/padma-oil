package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ConductSupplierAuditsController
{
    @javafx.fxml.FXML
    private TableColumn criteriaAuditTableColumn;
    @javafx.fxml.FXML
    private TableColumn statusAuditTableColumn;
    @javafx.fxml.FXML
    private TableView supplierAuditSectionTableView;
    @javafx.fxml.FXML
    private ComboBox<String> supplierAuditComboBox;
    @javafx.fxml.FXML
    private TableColumn noteAuditTableColumn;
    @javafx.fxml.FXML
    private TextField keyIssuesAuditTextField;
    @javafx.fxml.FXML
    private TextField supplierNameAuditTextField;
    @javafx.fxml.FXML
    private DatePicker auditDateAuditDatePicker;
    @javafx.fxml.FXML
    private TextField auditLocationTextField;
    @javafx.fxml.FXML
    private ComboBox<String> statusAuditComboBox;
    @javafx.fxml.FXML
    private TableColumn catergoryAuditTableColumn;
    @javafx.fxml.FXML
    private TextField auditorNameAuditTextField;
    @javafx.fxml.FXML
    private AnchorPane conductSuppliderAuditAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        statusAuditComboBox.getItems().addAll("1","2","3","4");
        supplierAuditComboBox.getItems().addAll("5","6","7","8");

    }

    @javafx.fxml.FXML
    public void saveAuditInformationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backAuditButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ConductSupplierAuditsController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)conductSuppliderAuditAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}