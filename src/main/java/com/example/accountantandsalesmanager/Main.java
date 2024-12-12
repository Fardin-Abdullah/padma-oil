package com.example.accountantandsalesmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PadmaOilCompanyDashboardView.fxml"));
        Scene firstscene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(firstscene);
        stage.show();
    }

    public static void main(String[] args) {

        //start(..);
        launch();
    }
}


