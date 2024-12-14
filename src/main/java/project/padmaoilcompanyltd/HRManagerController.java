package project.padmaoilcompanyltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HRManagerController {

    @javafx.fxml.FXML
    private AnchorPane rightSplitPane;
    @javafx.fxml.FXML
    private AnchorPane fullAnchorPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    //fxml action events
    @javafx.fxml.FXML
    public void approveHireButtonOnAction(ActionEvent actionEvent) {

        loadContent("HApproveHiringView.fxml");
    }

    @javafx.fxml.FXML
    public void enforcePolicyButtonOnAction(ActionEvent actionEvent) {

        loadContent("HEnforcePoliciesView.fxml");
    }

    @javafx.fxml.FXML
    public void manageBenefitsButtonOnAction(ActionEvent actionEvent) {

        loadContent("HManageBenefitsView.fxml");
    }

    @javafx.fxml.FXML
    public void manageEmployeeButtonOnAction(ActionEvent actionEvent) {

        loadContent("HManageEmployeeView.fxml");
    }

    @javafx.fxml.FXML
    public void processPayrollButtonOnAction(ActionEvent actionEvent) {

        loadContent("HProcessPayrollView.fxml");
    }

    @javafx.fxml.FXML
    public void reviewTimeOffButtonOnAction(ActionEvent actionEvent) {

        loadContent("HReviewTimeOffView.fxml");
    }

    @javafx.fxml.FXML
    public void trackTrainingButtonOnAction(ActionEvent actionEvent) {

        loadContent("HTrackTrainingView.fxml");
    }

    @javafx.fxml.FXML
    public void updateJobButtonOnAction(ActionEvent actionEvent) {

        loadContent("HUpdateJobView.fxml");
    }

    //back button
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {

        loadScene("LoginView.fxml");
    }

    //method to load content in right SplitPane
    private void loadContent(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane rightSplitPaneContent = loader.load();

            rightSplitPane.getChildren().clear();
            rightSplitPane.getChildren().add(rightSplitPaneContent);

            AnchorPane.setTopAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setBottomAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setLeftAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setRightAnchor(rightSplitPaneContent, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane anchorPaneContent = loader.load();

            fullAnchorPane.getChildren().clear();
            fullAnchorPane.getChildren().add(anchorPaneContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}