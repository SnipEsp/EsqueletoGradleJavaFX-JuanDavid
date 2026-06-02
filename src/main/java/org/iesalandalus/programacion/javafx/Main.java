package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.iesalandalus.programacion.javafx.controladores.InteraccionListaUsuarios;
import org.iesalandalus.programacion.javafx.controladores.Usuario;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;

import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
        InteraccionListaUsuarios ventanaPrincipal = (InteraccionListaUsuarios) Controladores.get("/vistas/InteraccionListaUsuarios.fxml", "Elige la opción", null);
        ventanaPrincipal.setUsuarios(List.of(new Usuario("Usuario 1", "12345678A"), new Usuario("Usuario 2", "12345678B"), new Usuario("Usuario 3", "12345678C"), new Usuario("Usuario 4", "12345678D"), new Usuario("Usuario 5", "12345678E")));
        ventanaPrincipal.getEscenario().show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
