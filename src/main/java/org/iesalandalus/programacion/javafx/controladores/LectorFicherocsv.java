package org.iesalandalus.programacion.javafx.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorFicherocsv extends Controlador {
    @FXML
    private ListView<Persona> lvLista;
    private static final String FICHERO_OBJETOS = String.format("%s%s%s", "ficheros", File.separator, "personas.dat");
    private static final String FICHERO_CSV = String.format("%s%s%s", "ficheros", File.separator, "personas.csv");

    private static List<Persona> leerCSVLibros() {
        List<Persona> personas = new ArrayList<>();
        // Supongamos que FICHERO_CSV apunta a "ficheros/personas.csv"
        try (BufferedReader entrada = new BufferedReader(new FileReader(FICHERO_CSV))) {
            String linea;
            while ((linea = entrada.readLine()) != null) {
                String[] campos = linea.split(","); // Troceamos por la coma

                // Mapeamos cada campo a su tipo de dato correspondiente:
                String nombre = campos[0];
                int edad = Integer.parseInt(campos[1]);

                // int anio = Integer.parseInt(campos[2]);       // Convertir a Entero
                //  double precio = Double.parseDouble(campos[3]); // Convertir a Decimal

                // Creamos el objeto con su constructor y lo añadimos a la lista
                personas.add(new Persona(nombre, edad));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el CSV: " + e.getMessage());
        }
        return personas;
    }

    @FXML
    void initialize() {
        // 1. Llamas al método que lee el archivo y te devuelve la lista
        List<Persona> listaDeFichero = leerCSVLibros();

        // 2. Pasas los datos al ListView de JavaFX
        lvLista.getItems().setAll(listaDeFichero);
    }
}
