module com.example.coremovies {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.coremovies to javafx.fxml;
    exports com.example.coremovies;
}