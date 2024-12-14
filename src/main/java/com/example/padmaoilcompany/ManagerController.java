package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerController {

    @javafx.fxml.FXML
    private AnchorPane rightSplitPane;
    @javafx.fxml.FXML
    private AnchorPane fullAnchorPane;

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

        loadScene("POCLdashboardView.fxml");
    }

    //method to load content in right SplitPane
    private void loadContent(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane rightSplitPaneContent = loader.load();

            rightSplitPane.getChildren().clear();
            rightSplitPane.getChildren().add(rightSplitPaneContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //method to load scene in full AnchorPane
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