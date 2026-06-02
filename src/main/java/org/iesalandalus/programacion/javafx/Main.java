package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;
import org.iesalandalus.programacion.javafx.utilidades.Dialogos;

public class Main extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
//        InteraccionListaUsuarios ventanaPrincipal = (InteraccionListaUsuarios) Controladores.get("/vistas/InteraccionListaUsuarios.fxml", "Interacción con lista de usuarios", null);
//        ventanaPrincipal.setUsuarios(List.of(new Usuario("Juan", "12345678A"), new Usuario("Pedro", "12345678B"), new Usuario("Maria", "12345678C")));
        Controlador ventanaPrincipal = Controladores.get("/vistas/LectorFicherocsv.fxml", "Elige la opción", null);
        ventanaPrincipal.getEscenario().setOnCloseRequest(this::salir);
        ventanaPrincipal.getEscenario().show();
    }


    private void salir(WindowEvent e) {
        Stage padre = (Stage) e.getSource();
        if (Dialogos.mostrarDialogoConfirmacion("Salir de la aplicación", "¿Estás seguro que desea salir de la aplicación?", padre)) {
            padre.close();
        } else {
            e.consume();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
