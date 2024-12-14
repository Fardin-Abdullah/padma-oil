package padmaOilCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class QualityControlManagerDashBoardController
{
    @javafx.fxml.FXML
    private AnchorPane qualityControlManagementAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void conductSupplierAuditsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/ConductSupplierAudits .fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void performRandomBatchInspectionButtonOnActio(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/RandomBatchInspection.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void logOutQualityControlManagerButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/GenarelDashboard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void ensureProductQualityComplianceButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/EnsureProductQualityCompliance .fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void reportNonComplaintProductsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/ReportNon-CompliantProducts.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void trackQualityMetricsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/trackQualityMetrics.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void calibrateQualityTestingButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/CalibrateQualityTestingEquipment .fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void reviewProductSpecificationsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/ReviewProductionSpecifications.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void investigateProductComplaintsButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(QualityControlManagerDashBoardController.class.getResource("/padmaOilCompany/QualityControlManager/InvestigateProductComplaints.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)qualityControlManagementAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}