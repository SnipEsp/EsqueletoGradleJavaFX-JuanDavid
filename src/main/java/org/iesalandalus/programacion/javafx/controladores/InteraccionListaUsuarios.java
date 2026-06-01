package org.iesalandalus.programacion.javafx.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class InteraccionListaUsuarios extends Controlador {

    @FXML
    private Label lbEtiqueta;

    @FXML
    private ListView<Usuario> lvLista;

    @FXML
    void initialize() {
        lvLista.getItems().addAll(new Usuario("Usuario 1", "12345678A"), new Usuario("Usuario 2", "12345678B"), new Usuario("Usuario 3", "12345678C"), new Usuario("Usuario 4", "12345678D"), new Usuario("Usuario 5", "12345678E"));
        lvLista.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> cambiarTexto());
    }

    void cambiarTexto() {
        Usuario seleccionado = lvLista.getSelectionModel().getSelectedItem();
        lbEtiqueta.setText("Has seleccionado: " + seleccionado);
    }


}