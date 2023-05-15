package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SeleccionFutbol> lista = new ArrayList<SeleccionFutbol>();
        lista.add(new Entrenador(1,"Julen","Lopetegui",50,2));
        lista.add(new Futbolista(1,"Karim","Benzema", 32, 9, "Delantero"));
        lista.add(new Masajista(1,"Pintus", "God", 56, "Licenciado", 20));
        lista.add(new Seleccionador(1,"Vicente","Del Bosque", 60));

        System.out.println(lista.get(0).toString());
        System.out.println(lista.get(1).toString());
        System.out.println(lista.get(2).toString());
        System.out.println(lista.get(3).toString());
    }
}