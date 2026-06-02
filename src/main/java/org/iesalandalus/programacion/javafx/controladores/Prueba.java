package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;
import org.iesalandalus.programacion.javafx.utilidades.Dialogos;

public class Prueba extends Controlador {
    private int pulsaciones = 0;
    @FXML
    private Label lbEtiqueta;

    @FXML
    void pulsado(ActionEvent event) {
        pulsaciones++;
        lbEtiqueta.setText("El botón ha sido pulsado " + pulsaciones + " veces");

        Controlador prueba = Controladores.get("/vistas/CajasCombinadas.fxml", "Elige la opción", getEscenario());
        prueba.getEscenario().show();
        prueba.getEscenario().setOnCloseRequest(this::salir);


//
//        if (Dialogos.mostrarDialogoConfirmacion("Salir de la aplicación", "¿Estás seguro que desea salir de la aplicación?", getEscenario())) {
//            getEscenario().close();
//        }
    }

    private void salir(WindowEvent e) {
        Stage padre = (Stage) e.getSource();
        if (Dialogos.mostrarDialogoConfirmacion("Salir de la aplicación", "¿Estás seguro que desea salir de la aplicación?", padre)) {
            padre.close();
        } else {
            e.consume();
        }
    }
}
