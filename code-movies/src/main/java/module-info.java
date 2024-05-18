module com.example.codemovies {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.codemovies to javafx.fxml;
    exports com.example.codemovies;
}