package org.iesalandalus.programacion.javafx.controladores;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

import java.util.List;

public class InteraccionListaUsuarios extends Controlador {

    @FXML
    private Label lbEtiqueta;

    @FXML
    private ListView<Usuario> lvLista;

    @FXML
    void initialize() {
        lvLista.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> cambiarTexto());
    }

    void cambiarTexto() {
        Usuario seleccionado = lvLista.getSelectionModel().getSelectedItem();
        lbEtiqueta.setText("Has seleccionado: " + seleccionado);
    }

    public void setUsuarios(List<Usuario> usuarios) {
        lvLista.setItems(FXCollections.observableArrayList(usuarios));
    }

}