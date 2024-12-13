module project.padmaoilcompanyltd {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.padmaoilcompanyltd to javafx.fxml;
    exports project.padmaoilcompanyltd;
}