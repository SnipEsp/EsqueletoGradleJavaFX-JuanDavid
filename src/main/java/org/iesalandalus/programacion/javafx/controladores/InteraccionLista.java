package org.iesalandalus.programacion.javafx.controladores;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

public class InteraccionLista extends Controlador {


    @FXML
    private Label lbOpcion;

    @FXML
    private ListView<String> lvLista;

    @FXML
    void initialize() {
        lvLista.setItems(FXCollections.observableArrayList("Caramelo", "Pistacho", "Chocolate Blanco", "Turrón", "Tarta de queso"));
        lvLista.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            lbOpcion.setText("Has seleccionado: " + newV);
        });
    }

}
