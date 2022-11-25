module com.example.demojavajx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demojavajx to javafx.fxml;
    exports com.example.demojavajx;
}