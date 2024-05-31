package org.example;
import Figuras_Geometricas.figuras_geometricas;
import Figuras_3D.esfera_3d;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //hoa
        //adasjdqgodhlskahdoasdasd

        figuras_geometricas fig = new figuras_geometricas();
        fig.mostrar();

        esfera_3d esfera3d= new esfera_3d(60);
        esfera3d.mostrar();

    }
}