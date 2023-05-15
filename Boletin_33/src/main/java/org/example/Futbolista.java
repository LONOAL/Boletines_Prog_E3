package org.example;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }

    @Override
    public void viajar() {
        super.viajar();
    }

    @Override
    public void entrenar() {
        super.entrenar();
    }

    @Override
    public void jugarPartido() {
        super.jugarPartido();
    }

    public void entrevista(){}

    @Override
    public String toString() {
        return
        " dorsal=" + dorsal+
        " demarcacion=" + demarcacion +
        " id=" + id+
        " nombre=" + nombre +
        " apellido=" + apellido +
        " edad=" + edad
        ;
    }
}
