package org.example;
import Figuras_Geometricas.figuras_geometricas;
import Figuras_3D.esfera_3d;
import Figuras_3D.cilindro_3d;
import Figuras_3D.cubo_3d;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        esfera_3d esfera3d= new esfera_3d(60);
        esfera3d.mostrar();

        cilindro_3d cilindro3d=new cilindro_3d(10,15);
        cilindro3d.mostrar();

        cubo_3d cubo3d=new cubo_3d(17);
        cubo3d.mostrar();

    }
}