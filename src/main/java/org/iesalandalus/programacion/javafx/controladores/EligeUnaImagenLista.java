package org.iesalandalus.programacion.javafx.controladores;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class EligeUnaImagenLista extends Controlador {

    @FXML
    private ChoiceBox<String> cbLista;

    @FXML
    private Label lbEtiqueta;

    @FXML
    void initialize() {


        cbLista.setItems(FXCollections.observableArrayList("Cerveza", "Pan", "Queso"));
        cbLista.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            cambiarTexto();
        });
    }

    private void cambiarTexto() {
        lbEtiqueta.setText("Has seleccionado la imagen " + cbLista.getValue());
    }

}