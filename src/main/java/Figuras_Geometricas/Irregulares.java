package Figuras_Geometricas;

public class Irregulares extends figuras_2d {
    double angulos_internos;

    public Irregulares() {
    }

    public Irregulares(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado, double angulos_internos) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
        this.angulos_internos = angulos_internos;
    }


    @Override
    public Double calcular_perimetro() {
        perimetro = numero_lados * tamaño_lado;
        return perimetro;
    }
}
