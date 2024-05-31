package Figuras_Geometricas;

public class circulos extends Regulares{
    Double radio;

    public circulos() {
    }

    public circulos(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado, Double radio) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
        this.radio = radio;
    }

    @Override
    public Double calcular_area() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double calcular_perimetro() {
        return 2 * Math.PI * radio;
    }
}
