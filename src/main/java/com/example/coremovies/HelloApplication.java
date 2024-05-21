package com.example.coremovies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /* El programa completo */

        int ancho = 950, largo = 650;

        /*Recolectando la información del FMLX*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\com\\example\\coremovies\\hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), ancho, largo);
        stage.getIcons().addAll(new Image("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\video-player.png"));
        stage.setTitle("  John's Movies");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}