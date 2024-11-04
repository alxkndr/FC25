module com.example.fc25 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.fc25 to javafx.fxml;
    exports com.example.fc25;
}