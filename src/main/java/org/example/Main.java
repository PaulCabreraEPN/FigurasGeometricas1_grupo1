package org.example;
import java.util.Scanner;
import Figuras_Geometricas.esfera_3d;
import Figuras_Geometricas.cilindro_3d;
import Figuras_Geometricas.cubo_3d;
import Figuras_Geometricas.prisma_3d;
import Figuras_Geometricas.piramide_3d;
import Figuras_Geometricas.cono_3d;


public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Bienvenido");
            System.out.println("Menu");
            System.out.println("1)Figuras Geometricas");
            System.out.println("2) Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {

                    int dimension;
                    System.out.println("Que clase de figura desea: ");
                    System.out.println(" 1) 2D");
                    System.out.println(" 2) 3D");
                    dimension = sc.nextInt();
                    switch (dimension) {
                        case 1:
                            System.out.println("Disponemos de: ");
                            break;
                        case 2:
                            int tipo;
                            System.out.println("Disponemos de: ");
                            System.out.println("1) Esfera");
                            System.out.println("2) Cilindro");
                            System.out.println("3) Cubo");
                            System.out.println("4) Piramide");
                            System.out.println("5) Cono");
                            tipo = sc.nextInt();
                            switch (tipo) {
                                case 1:
                                    double radio;
                                    System.out.println("Ingrese el radio: ");
                                    radio = sc.nextDouble();
                                    esfera_3d figura=new esfera_3d(radio);
                                    figura.mostrar();
                                    opcion--;
                                    break;

                                case 2:
                                    double radio2;
                                    System.out.println("Ingrese el radio: ");
                                    radio2 = sc.nextDouble();
                                    double altura;
                                    System.out.println("Ingrese el altura: ");
                                    altura = sc.nextDouble();
                                    cilindro_3d figura2=new cilindro_3d(radio2,altura);
                                    figura2.mostrar();
                                    opcion--;
                                    break;


                                case 3:
                                    double lado;
                                    System.out.println("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    cubo_3d figura3=new cubo_3d(lado);
                                    figura3.mostrar();
                                    break;

                                case 4:
                                    double lado2;
                                    System.out.println("Ingrese el valor del lado: ");
                                    lado2 = sc.nextDouble();
                                    double altura2;
                                    System.out.println("Ingrese el valor del altura: ");
                                    altura2 = sc.nextDouble();
                                    double apotema;
                                    System.out.println("Ingrese el apotema: ");
                                    apotema = sc.nextDouble();
                                    piramide_3d figura4=new piramide_3d(altura2,lado2,apotema);
                                    figura4.mostrar();
                                    break;

                                case 5:
                                    double altura3;
                                    System.out.println("Ingrese el valor del altura: ");
                                    altura3 = sc.nextDouble();
                                    double apotema2;
                                    System.out.println("Ingrese el valor del apotema: ");
                                    apotema2 = sc.nextDouble();
                                    double radio3;
                                    System.out.println("Ingrese el radio: ");
                                    radio3 = sc.nextDouble();
                                    cono_3d figura5=new cono_3d(altura3,radio3,apotema2);
                                    figura5.mostrar();
                                    break;



                            }
                    }




            }


        }while(opcion<2);



    }
}
