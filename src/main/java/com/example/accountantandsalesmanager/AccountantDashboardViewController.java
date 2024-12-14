package com.example.accountantandsalesmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AccountantDashboardViewController
{
    @javafx.fxml.FXML
    private AnchorPane accountantDashboardViewAnchorPane;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private TextField deptTextField;
    @javafx.fxml.FXML
    private TextField roleTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageAccountsReceivableMenuItemOnAction(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageAccountsReceivableView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            //Stage tempstage =(Stage)((Node))actionEvent.getSource()).getScene().getWindow());
            tempStage.setTitle("Manage Accounts Recievable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void manageAccountsPayableMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageAccountsPayableView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Manage Accounts Payable");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void logoutMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("POCLdashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Welcome");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void homeMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountantDashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Welcome");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void prepareTaxFillingsMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PrepareTaxFillingsView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Prepare Tax Fillings");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void trackExpenseReporstMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TrackExpenseReportsView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Track Expense Reports");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void aboutMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("POCLdashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("About us");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void reconcileBankAccountsButtonOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReconcileBankAccountsView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Reconcile Bank Accounts");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void monitorCashFlowMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MonitorCashFlowView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Monitor Cash Flow");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void recordFinancialTransactionMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("RecordFinancialTransactionView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Record Financial Transaction");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void generateFinancialStatementsMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("GenerateFinancialStatementsView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Generate Financial Statements");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void exitMenuItemOnAction(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("POCLdashboardView.fxml"));
            Scene viewscene = new Scene(fxmlLoader.load());
            Stage tempStage = (Stage)accountantDashboardViewAnchorPane.getScene().getWindow();
            tempStage.setTitle("Welcome");
            tempStage.setScene(viewscene);
            tempStage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public void handleBackButtonAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PreviousSceneView.fxml"));
            Scene previousScene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) accountantDashboardViewAnchorPane.getScene().getWindow();
            stage.setTitle("Previous Scene"); stage.setScene(previousScene); stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
            }
        }

    @javafx.fxml.FXML
    public void updateProfileButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("UpdateAccountantView.fxml"));
            Scene previousScene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) accountantDashboardViewAnchorPane.getScene().getWindow();
            stage.setTitle("Update Informatiion"); stage.setScene(previousScene); stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("POCLdashboardView.fxml"));
            Scene previousScene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) accountantDashboardViewAnchorPane.getScene().getWindow();
            stage.setTitle("Welcome"); stage.setScene(previousScene); stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

