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

public class ReviewProductionSpecificationsController
{
    @javafx.fxml.FXML
    private TextField lastUpdateReviewTextField;
    @javafx.fxml.FXML
    private TableColumn specificationNameReviewTableColumn;
    @javafx.fxml.FXML
    private TableView reviewProductTableView;
    @javafx.fxml.FXML
    private TextField toleranceRangeReviewTextField;
    @javafx.fxml.FXML
    private TextField currentStatusReviewTextField;
    @javafx.fxml.FXML
    private ComboBox<String> productCalegoryReviewComboBOx;
    @javafx.fxml.FXML
    private TableColumn currentStatusReviewTableColumn;
    @javafx.fxml.FXML
    private TableColumn lastUpdatedReviewTableColumn;
    @javafx.fxml.FXML
    private TableColumn toleranceRangeReviewTableColumn;
    @javafx.fxml.FXML
    private AnchorPane reviewProductSpecificationAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
        productCalegoryReviewComboBOx.getItems().addAll("A","B","C","D");
    }


    @javafx.fxml.FXML
    public void saveChangeReviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkReviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backReviewButtonOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(ReviewProductionSpecificationsController.class.getResource("/padmaOilCompany/QualityControlManagerDashBoard.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)reviewProductSpecificationAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}