package org.iesalandalus.programacion.javafx.controladores;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;
import org.iesalandalus.programacion.javafx.utilidades.Dialogos;

import java.util.List;

public class PruebaConMenus extends Controlador {

    public void miCerrarPrograma() {
        if (Dialogos.mostrarDialogoConfirmacion("¿Salir?", "¿Estás seguro de que quieres cerrar la ventana?", getEscenario())) {
            getEscenario().close();
        }
    }

    public void miListarUsuarios() {
        InteraccionListaUsuarios ventanaSecundaria = (InteraccionListaUsuarios) Controladores.get("/vistas/InteraccionListaUsuarios.fxml", "Interacción con lista de usuarios", getEscenario());
        ventanaSecundaria.setUsuarios(List.of(new Usuario("Juan", "12345678A"), new Usuario("Pedro", "12345678B"), new Usuario("Maria", "12345678C")));
        ventanaSecundaria.getEscenario().show();
        ventanaSecundaria.getEscenario().setOnCloseRequest(this::salir);

    }

    public void miAcercaDe() {
        Controlador ventanaTercera = Controladores.get("/vistas/InteraccionLista.fxml", "Interaccion con Listas", getEscenario());
        ventanaTercera.getEscenario().show();
        ventanaTercera.getEscenario().setOnCloseRequest(this::salir);

    }

    public void abrirPrueba() {
        Controlador ventanaCuarta = Controladores.get("/vistas/Prueba.fxml", "Prueba", getEscenario());
        ventanaCuarta.getEscenario().show();
        ventanaCuarta.getEscenario().setOnCloseRequest(this::salir);
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
