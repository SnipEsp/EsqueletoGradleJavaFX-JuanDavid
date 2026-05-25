package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        Parent raiz = FXMLLoader.load(getClass().getResource("/vistas/VentanaPrincipal.fxml"));
        Scene escena = new Scene(raiz);
        escenarioPrincipal.setTitle("Hola mundo desde JavaFX");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
