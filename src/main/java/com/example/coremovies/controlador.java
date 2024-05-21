package com.example.coremovies;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class controlador implements Initializable {

    @FXML
    private HBox movieLayout;
    private List<movies> presentarPeliculas;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        presentarPeliculas = new ArrayList<>(presentarPeliculas());
        try {
            for (int i = 0 ; i < presentarPeliculas.size() ; i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\com\\example\\coremovies\\tarjeta.fxml"));
                HBox cajaEspacio = fxmlLoader.load();
                tarjeta_controlador tarjetaControlador = fxmlLoader.getController();
                tarjetaControlador.setData(presentarPeliculas.get(i));
                movieLayout.getChildren().add(cajaEspacio);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //Creando los objetos para presentar en el FXML.
    public List<movies> presentarPeliculas () {

        List<movies> listaPeliculas = new ArrayList<>();

        movies batman = new movies();
        batman.setName("Batman Caballero Oscuro");
        batman.setDate("2008");
        batman.setGender("Acción");
        batman.setImageSrc("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\batman.jpg");
        listaPeliculas.add(batman);

        movies matrix = new movies();
        matrix.setName("Matriz");
        matrix.setDate("1999");
        matrix.setGender("Acción");
        matrix.setImageSrc("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\matrix.jpg");
        listaPeliculas.add(matrix);

        movies terminator = new movies();
        terminator.setName("Terminator 2");
        terminator.setDate("1991");
        terminator.setGender("Ciencia ficción");
        terminator.setImageSrc("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\terminator.jpg");
        listaPeliculas.add(terminator);

        movies leon = new movies();
        leon.setName("León");
        leon.setDate("1994");
        leon.setGender("Suspenso");
        leon.setImageSrc("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\leon.jpg");
        listaPeliculas.add(leon);

        movies increibles = new movies();
        increibles.setName("Los increíbles");
        increibles.setDate("2004");
        increibles.setGender("Animación");
        increibles.setImageSrc("C:\\Users\\johna\\Documents\\Programación\\Java\\core-movies\\src\\main\\resources\\assets\\increibles.jpg");
        listaPeliculas.add(increibles);

        return listaPeliculas;
    }

}
