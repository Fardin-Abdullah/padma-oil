package project.padmaoilcompanyltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerViewController {

    @javafx.fxml.FXML
    private AnchorPane rightSplitPaneFxid;
    @javafx.fxml.FXML
    private Button backfxiddd;

    @javafx.fxml.FXML
    public void initialize() {
    }

    //fxml action events
    @javafx.fxml.FXML
    public void viewProductionButtonOnAction(ActionEvent actionEvent) {
        loadContent("MViewReportsView.fxml");
    }

    @javafx.fxml.FXML
    public void approveBudgetButtonOnAction(ActionEvent actionEvent) {
        loadContent("MApproveBudgetView.fxml");
    }

    @javafx.fxml.FXML
    public void approveTimeOffButtonOnAction(ActionEvent actionEvent) {
        loadContent("MApproveTimeOffView.fxml");
    }

    @javafx.fxml.FXML
    public void trackProjectButtonOnAction(ActionEvent actionEvent) {
        loadContent("MTrackProjectView.fxml");
    }

    @javafx.fxml.FXML
    public void assignTasksButtonOnAction(ActionEvent actionEvent) {
        loadContent("MAssignTasksView.fxml");
    }

    @javafx.fxml.FXML
    public void reviewSafetyButtonOnAction(ActionEvent actionEvent) {
        loadContent("MReviewSafetyView.fxml");
    }

    @javafx.fxml.FXML
    public void accessHRButtonOnAction(ActionEvent actionEvent) {
        loadContent("MAccessHRView.fxml");
    }

    @javafx.fxml.FXML
    public void holdMeetingsButtonOnAction(ActionEvent actionEvent) {
        loadContent("MHoldMeetingsView.fxml");
    }

    //back button
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //method to load content in right SplitPane
    private void loadContent(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane rightSplitPaneContent = loader.load();

            rightSplitPaneFxid.getChildren().clear();
            rightSplitPaneFxid.getChildren().add(rightSplitPaneContent);

            AnchorPane.setTopAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setBottomAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setLeftAnchor(rightSplitPaneContent, 0.0);
            AnchorPane.setRightAnchor(rightSplitPaneContent, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}