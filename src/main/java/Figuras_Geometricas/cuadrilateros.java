package Figuras_Geometricas;

public class cuadrilateros extends Regulares{

    public cuadrilateros() {
    }

    public cuadrilateros(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
    }

    @Override
    public Double calcular_area() {
        return tamaño_lado * tamaño_lado;
    }

    @Override
    public Double calcular_perimetro() {
        return tamaño_lado + tamaño_lado + tamaño_lado + tamaño_lado;
    }
}
