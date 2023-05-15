
package org.example.presentacion;

import java.io.File;


public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("contratados.txt");
        File e = new File("destajados.txt");
        GUI obx = new GUI();
        obx.llevarElFile(f,e);
        obx.setVisible(true);
        
    }
}
