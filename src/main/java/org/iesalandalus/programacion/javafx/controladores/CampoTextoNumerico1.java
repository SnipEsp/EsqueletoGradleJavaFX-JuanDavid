package org.iesalandalus.programacion.javafx.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class CampoTextoNumerico1 extends Controlador {

    @FXML
    private Label lbLongitud;

    @FXML
    private TextField tfCuadroNumerico;

    @FXML
    public void initialize() {
        longitud();
    }

    public void longitud() {
        tfCuadroNumerico.textProperty().addListener((obs, oldV, newV) -> {
            mostrarLongitud(oldV, newV);
        });
    }

    public void mostrarLongitud(String oldV, String newV) {
        if (!newV.matches("\\d+(\\.\\d+)?")) {
            tfCuadroNumerico.setStyle("-fx-border-color: red;");
        } else {
            tfCuadroNumerico.setStyle("-fx-border-color: green;");
            lbLongitud.setText("Longitud de: " + String.valueOf(newV.length()) + " caracteres");


        }

    }

}

