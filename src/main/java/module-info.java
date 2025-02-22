module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.example.controller to javafx.fxml;
    exports com.example.view;
}
