package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BotonPulsado {
    private int nVeces;

    @FXML
    private Label lbTexto;

    @FXML
    void pulsar(ActionEvent event) {
        nVeces = nVeces + 1;
        lbTexto.setText("EL BOTÓN HA SIDO PULSADO: " + nVeces + " VECES");
    }
}
