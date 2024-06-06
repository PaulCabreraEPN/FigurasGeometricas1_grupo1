package Figuras_Geometricas;

public class n_lados extends Regulares{

    Double apotema;

    public n_lados() {

    }

    public n_lados(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado, Double apotema) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
        this.apotema = apotema;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    //Metodos


    @Override
    public Double calcular_perimetro(){
        return tamaño_lado*numero_lados;
    }

    @Override
    public Double calcular_area() {
        return (calcular_perimetro() * apotema)/2;
    }
}
