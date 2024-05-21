package com.example.coremovies;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class busqueda {
    public static void main(String[] args) {

        //IMPLEMENTANDO BUSQUEDA DESDE EL FXML;

        List<String> buscarPelicula = new ArrayList<>();
        String usuarioBusqueda = "";
        TextField introducido = new TextField();
        boolean encontrado = false;
        int i = 0;

        while ( (i < buscarPelicula.size()) && !encontrado )
            if (buscarPelicula.get(i) == usuarioBusqueda)
                encontrado = true;

        if (encontrado)
            System.out.println("Sí hay algún valor 13 en la lista.");
        else
            System.out.println("No hay ningún valor 13 en la lista.");

    }
}