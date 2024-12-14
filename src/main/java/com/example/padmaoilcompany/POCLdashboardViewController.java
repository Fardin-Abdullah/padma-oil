package com.example.padmaoilcompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POCLdashboardViewController {

    @FXML
    private TextField userIdTextField;

    @FXML
    private ComboBox<String> roleSelectComboBox;

    @FXML
    private PasswordField passwordTextField;

    private Map<String, List<User>> roleToUsersMap = new HashMap<>();

    @FXML
    public void initialize() {

        roleSelectComboBox.getItems().clear();


        roleSelectComboBox.getItems().addAll(
                "Manager",
                "HR Manager",
                "Sales Manager",
                "Accountant",
                "Supply Chain Manager",
                "Quality Control Manager"
        );

        List<User> managerUsers = new ArrayList<>();
        managerUsers.add(new User("100000", "manager123", "Manager"));
        roleToUsersMap.put("Manager", managerUsers);

        List<User> hrManagerUsers = new ArrayList<>();
        hrManagerUsers.add(new User("200000", "hrmanager123", "HR Manager"));
        roleToUsersMap.put("HR Manager", hrManagerUsers);

        List<User> salesManagerUsers = new ArrayList<>();
        salesManagerUsers.add(new User("300000", "salesmanager123", "Sales Manager"));
        salesManagerUsers.add(new User("300001", "salesmanager456", "Sales Manager"));
        roleToUsersMap.put("Sales Manager", salesManagerUsers);

        List<User> accountantUsers = new ArrayList<>();
        accountantUsers.add(new User("400000", "accountant123", "Accountant"));
        accountantUsers.add(new User("400001", "accountant456", "Accountant"));
        roleToUsersMap.put("Accountant", accountantUsers);

        List<User> supplyChainManagerUsers = new ArrayList<>();
        supplyChainManagerUsers.add(new User("500000", "supplychainmanager123", "Supply Chain Manager"));
        supplyChainManagerUsers.add(new User("500001", "supplychainmanager456", "Supply Chain Manager"));
        roleToUsersMap.put("Supply Chain Manager", supplyChainManagerUsers);

        List<User> qualityControlManagerUsers = new ArrayList<>();
        qualityControlManagerUsers.add(new User("600000", "qualitycontrolmanager123", "Quality Control Manager"));
        qualityControlManagerUsers.add(new User("600001", "qualitycontrolmanager456", "Quality Control Manager"));
        roleToUsersMap.put("Quality Control Manager", qualityControlManagerUsers);
    }

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        String selectedRole = roleSelectComboBox.getValue();
        String enteredUserId = userIdTextField.getText();
        String enteredPassword = passwordTextField.getText();

        if (selectedRole == null) {
            showAlert("Login Error", "Please select a role.", AlertType.ERROR);
            return;
        }

        List<User> users = roleToUsersMap.get(selectedRole);

        if (users != null) {
            for (User user : users) {
                if (user.getUserId().equals(enteredUserId) && user.getPassword().equals(enteredPassword)) {
                    loadDashboard(selectedRole);
                    return;
                }
            }
        }

        showAlert("Login Error", "Invalid User ID or Password.", AlertType.ERROR);
    }

    private void loadDashboard(String role) {
        try {
            FXMLLoader loader = new FXMLLoader();
            Scene scene;

            switch (role) {
                case "Manager":
                    loader.setLocation(getClass().getResource("Manager.fxml"));
                    scene = new Scene(loader.load());
                    break;
                case "HR Manager":
                    loader.setLocation(getClass().getResource("HRManager.fxml"));
                    scene = new Scene(loader.load());
                    break;
                case "Sales Manager":
                    loader.setLocation(getClass().getResource("SalesManagerDashboardView.fxml"));
                    scene = new Scene(loader.load());
                    break;
                case "Accountant":
                    loader.setLocation(getClass().getResource("AccountantDashboardView.fxml"));
                    scene = new Scene(loader.load());
                    break;
                case "Supply Chain Manager":
                    loader.setLocation(getClass().getResource("SupplyChainManagerDashboard.fxml"));
                    scene = new Scene(loader.load());
                    break;
                case "Quality Control Manager":
                    loader.setLocation(getClass().getResource("QualityControlManagerDashBoard.fxml"));
                    scene = new Scene(loader.load());
                    break;
                default:
                    throw new Exception("Role not found");
            }

            Stage stage = (Stage) passwordTextField.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void forgotPasswordButtonOnAction(ActionEvent actionEvent) {
        showAlert("Forgot Password", "Please contact IT support to reset your password.", AlertType.INFORMATION);
    }

    public static class User {
        private String userId;
        private String password;
        private String role;

        public User(String userId, String password, String role) {
            this.userId = userId;
            this.password = password;
            this.role = role;
        }

        public String getUserId() {
            return userId;
        }

        public String getPassword() {
            return password;
        }

        public String getRole() {
            return role;
        }
    }
}
