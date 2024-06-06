package org.example;
import Figuras_Geometricas.esfera_3d;
import Figuras_Geometricas.cilindro_3d;
import Figuras_Geometricas.cubo_3d;
import Figuras_Geometricas.prisma_3d;
import Figuras_Geometricas.piramide_3d;
import Figuras_Geometricas.cono_3d;
import Figuras_Geometricas.n_lados;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        esfera_3d esfera3d= new esfera_3d(60);
        esfera3d.mostrar();

        cilindro_3d cilindro3d=new cilindro_3d(10,15);
        cilindro3d.mostrar();

        cubo_3d cubo3d=new cubo_3d(17);
        cubo3d.mostrar();

        prisma_3d prisma3d=new prisma_3d(4,12,3);
        prisma3d.mostrar();
        piramide_3d piramide3d=new piramide_3d(6,10,20);
        piramide3d.mostrar();

        cono_3d cono3d= new cono_3d(13,5,17);
        cono3d.mostrar();

        n_lados ejemplo=new n_lados();
        ejemplo.setNumero_lados(5);
        ejemplo.setApotema(12.0);
        ejemplo.setTamaño_lado(10.0);
        System.out.println("N LADOS");
        System.out.println(ejemplo.calcular_perimetro());
        System.out.println(ejemplo.calcular_area());


    }
}