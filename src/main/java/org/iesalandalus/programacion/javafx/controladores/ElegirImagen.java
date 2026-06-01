package org.iesalandalus.programacion.javafx.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class ElegirImagen extends Controlador {

    @FXML
    private ToggleGroup grupo;

    @FXML
    private Label lbImagen;

    @FXML
    void initialize() {
        grupo.selectedToggleProperty().addListener((obs, oldV, newV) -> cambiarTexto());
    }

    @FXML
    void cambiarTexto() {
        RadioButton seleccionado = (RadioButton) grupo.getSelectedToggle();
        lbImagen.setText("Has seleccionado la imagen " + seleccionado.getText());
    }
}
