module com.example.javafxpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxpro to javafx.fxml;
    exports com.example.javafxpro;
}