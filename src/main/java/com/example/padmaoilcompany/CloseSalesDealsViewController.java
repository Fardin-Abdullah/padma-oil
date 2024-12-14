package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CloseSalesDealsViewController {

    @javafx.fxml.FXML
    private AnchorPane closeSalesDealsAnchorPane;

    @javafx.fxml.FXML
    private ComboBox<String> salesDealsComboBox;
    @javafx.fxml.FXML
    private TextField pricingTextField;

    @javafx.fxml.FXML
    private TextField termsTextField;

    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        salesDealsComboBox.getItems().addAll("Client 1", "Client 2", "Client 3");
        paymentMethodComboBox.getItems().addAll("Credit Card", "Bank Transfer", "Bkash");
    }

    @javafx.fxml.FXML
    public void backButttonOnAction(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SalesManagerDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage) closeSalesDealsAnchorPane.getScene().getWindow();
            tempStage.setTitle("Sales Manager Dashboard");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void finalizeDealButtonOnAction(ActionEvent actionEvent) {
        // Collect the input data from the form
        String selectedClient = salesDealsComboBox.getValue();
        String pricing = pricingTextField.getText();
        String terms = termsTextField.getText();
        String paymentMethod = paymentMethodComboBox.getValue();


        if (selectedClient == null || pricing.isEmpty() || terms.isEmpty() || paymentMethod == null) {

            System.out.println("Please complete all fields before finalizing the deal.");
        } else {

            System.out.println("Deal finalized for client: " + selectedClient);
            System.out.println("Pricing: " + pricing);
            System.out.println("Terms: " + terms);
            System.out.println("Payment Method: " + paymentMethod);


            salesDealsComboBox.setValue(null);
            pricingTextField.clear();
            termsTextField.clear();
            paymentMethodComboBox.setValue(null);

            System.out.println("Deal successfully closed.");
        }
    }
}
