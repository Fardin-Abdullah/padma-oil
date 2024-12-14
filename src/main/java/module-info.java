module com.example.padmaoilcompany {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens com.example.padmaoilcompany to javafx.fxml;
    exports com.example.padmaoilcompany;
}