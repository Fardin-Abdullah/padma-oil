module com.example.simulatingoperationsofpadmaoil {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens padmaOilCompany to javafx.fxml;
    exports padmaOilCompany;

}