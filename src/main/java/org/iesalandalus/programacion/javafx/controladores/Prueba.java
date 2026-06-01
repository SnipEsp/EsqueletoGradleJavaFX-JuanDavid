package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class Prueba extends Controlador {
    private int pulsaciones = 0;
    @FXML
    private Label lbEtiqueta;

    @FXML
    void pulsado(ActionEvent event) {
        pulsaciones++;
        lbEtiqueta.setText("El botón ha sido pulsado " + pulsaciones + " veces");
    }
}
