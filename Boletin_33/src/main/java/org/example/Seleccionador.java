package org.example;

public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }

    public void seleccionarXogador(){}

    @Override
    public String toString() {
        return
        " id=" + id+
        " nombre=" + nombre +
        " apellido=" + apellido +
        " edad=" + edad
        ;
    }
}
