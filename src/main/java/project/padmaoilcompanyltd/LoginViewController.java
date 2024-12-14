package project.padmaoilcompanyltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginViewController {

    @javafx.fxml.FXML
    private AnchorPane fullAnchorPane;

    @javafx.fxml.FXML
    public void managerButtonOnAction(ActionEvent actionEvent) {

        loadContent("Manager.fxml");
    }

    @javafx.fxml.FXML
    public void hrManagerButtonOnAction(ActionEvent actionEvent) {
        
        loadContent("HRManager.fxml");
    }
    
    
    //method to load content in right SplitPane
    private void loadContent(String fxmlFile) {
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
