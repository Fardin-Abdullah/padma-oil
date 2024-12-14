package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InvestigateProductComplaintsController
{
    @javafx.fxml.FXML
    private TableColumn statusComplaintTableColumn;
    @javafx.fxml.FXML
    private TableColumn productNameComplaintTableColumn;
    @javafx.fxml.FXML
    private DatePicker investigationDateComplaintDatePicker;
    @javafx.fxml.FXML
    private TextField FindingsComplaintTextField;
    @javafx.fxml.FXML
    private TableColumn complaintDateComplaintTableColumn;
    @javafx.fxml.FXML
    private TextField investigationNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> complainIdComplainComboBox;
    @javafx.fxml.FXML
    private TableView complainManagementTableView;
    @javafx.fxml.FXML
    private TableColumn complaintIdComplaintTableColumn;
    @javafx.fxml.FXML
    private AnchorPane complaintManagementAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        complainIdComplainComboBox.getItems().addAll("W","Q","E","R");
    }

    @javafx.fxml.FXML
    public void saveResultButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchComplainButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backComplaintButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(InvestigateProductComplaintsController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)complaintManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}