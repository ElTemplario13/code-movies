package com.example.coremovies;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import com.example.coremovies.movies;

public class tarjeta_controlador {

    @FXML
    private HBox caja;

    @FXML
    private ImageView caratulaImagen;

    @FXML
    private Label estreno;

    @FXML
    private Label genero;

    @FXML
    private Label nombre;

    public void setData(movies movies) {
        Image caratula = new Image(getClass().getResourceAsStream(movies.getImageSrc()));
        caratulaImagen.setImage(caratula);
        nombre.setText(movies.getName());
        genero.setText(movies.getGender());
        estreno.setText(movies.getDate());
        caja.setStyle("-fx-background-color: #00356B");

    }
}
