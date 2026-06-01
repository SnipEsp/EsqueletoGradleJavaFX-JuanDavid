package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.iesalandalus.programacion.javafx.controladores.Usuario;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
        Controlador ventanaPrincipal = Controladores.get("/vistas/InteraccionListaUsuarios.fxml", "Elige la opción", null);
        ventanaPrincipal.getEscenario().show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
