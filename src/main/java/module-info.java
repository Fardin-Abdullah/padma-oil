module com.example.accountantandsalesmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.accountantandsalesmanager to javafx.fxml;
    exports com.example.accountantandsalesmanager;
}