module com.example.simulatingoperationsofpadmaoil {
    requires javafx.controls;
    requires javafx.fxml;


    opens padmaOilCompany to javafx.fxml;
    exports padmaOilCompany;
}