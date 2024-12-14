package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GenarelDashboardController
{
    @javafx.fxml.FXML
    private AnchorPane genarelDashboardAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void supplyChainButtonOnAction(ActionEvent Event) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(GenarelDashboardController.class.getResource("/padmaOilCompany/SupplyChainManagerDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)genarelDashboardAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void qualityControlManagerButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(GenarelDashboardController.class.getResource("/padmaOilCompany/QualityControlManager/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)genarelDashboardAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}