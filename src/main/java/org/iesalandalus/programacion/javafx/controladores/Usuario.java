package org.iesalandalus.programacion.javafx.controladores;

public class Usuario {
    private String nombre;
    private String dni;
    private String contrasenya;


    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return String.format("%s, %s", nombre, dni);
    }


}
