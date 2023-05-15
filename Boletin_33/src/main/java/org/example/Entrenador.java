package org.example;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento(){}

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return
        " idFederacion=" + idFederacion+
        " id=" + id+
        " nombre=" + nombre +
        " apellido=" + apellido +
        " edad=" + edad
        ;
    }
}
