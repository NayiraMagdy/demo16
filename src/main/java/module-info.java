module com.example.demo16 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo16 to javafx.fxml;
    exports com.example.demo16;
}