package org.iesalandalus.programacion.javafx.controladores;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class CajasCombinadas extends Controlador {

    @FXML
    private Label lbMostrar;

    @FXML
    private ComboBox<String> cbEleccion;

    @FXML
    void initialize() {
        cbEleccion.setItems(FXCollections.observableArrayList("Caramelo", "Pistacho", "Chocolate Blanco"));
        cbEleccion.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            cambiarTexto();
        });
    }

    void cambiarTexto() {
        lbMostrar.setText("Has seleccionado: " + cbEleccion.getValue() + " como extra.");
    }

}