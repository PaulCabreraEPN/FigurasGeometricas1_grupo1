package Figuras_Geometricas;
import java.util.Scanner;
public class esfera_3d extends figuras_3d{
    Scanner sc = new Scanner(System.in);

    double radio;
    double pi;

    public esfera_3d() {
    }

    public esfera_3d(double radio) {
        super("Esfera",0);
        this.radio = radio;
        this.pi = 3.14159265358979323846;
    }

    @Override
    public double calcular_area() {
        double area = 4 * pi * radio * radio;
        return area;
    }

    @Override
    public double calcular_volumen() {
        double volumen = (4.0/3.0)* pi * (radio * radio *radio);
        return volumen;
    }


    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcular_area());
        System.out.println("Volumen: " + calcular_volumen());
    }

}
