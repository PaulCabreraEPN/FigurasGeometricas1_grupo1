package Figuras_Geometricas;

public class Rectangulo extends cuadrilateros{

    Double base;
    Double altura;

    public Rectangulo() {
    }

    public Rectangulo(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
    }

    @Override
    public Double calcular_area() {
        area = base * altura;
        return area;
    }
}
