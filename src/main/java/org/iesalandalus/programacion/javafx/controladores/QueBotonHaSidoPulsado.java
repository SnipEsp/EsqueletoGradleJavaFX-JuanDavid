package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QueBotonHaSidoPulsado {
    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Label etiqueta;

    @FXML
    void pulsar(ActionEvent e) {
    if (e.getSource() == boton1) {
        etiqueta.setText("HAS PULSADO EL BOTÓN 1");
        etiqueta.setStyle("-fx-background-color: yellow;");
    } else if (e.getSource() == boton2) {
        etiqueta.setText("HAS PULSADO EL BOTÓN 2");
        etiqueta.setStyle("-fx-background-color: red;");
    } else if (e.getSource() == boton3) {
        etiqueta.setText("HAS PULSADO EL BOTÓN 3");
        etiqueta.setStyle("-fx-background-color: blue;");
    }

    }

}
