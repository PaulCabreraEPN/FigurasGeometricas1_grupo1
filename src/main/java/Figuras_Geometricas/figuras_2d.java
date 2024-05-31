package Figuras_Geometricas;

public class figuras_2d extends figuras_geometricas {

    Double area;
    Double perimetro;
    Double tamaño_lado;

    public figuras_2d() {
    }

    public figuras_2d(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado) {
        super(numero_lados, nombre);
        this.area = area;
        this.perimetro = perimetro;
        this.tamaño_lado = tamaño_lado;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getTamaño_lado() {
        return tamaño_lado;
    }

    public void setTamaño_lado(Double tamaño_lado) {
        this.tamaño_lado = tamaño_lado;
    }

    public Double calcular_area() {
        return area;
    }
    public Double calcular_perimetro() {
        return perimetro;
    }

}
