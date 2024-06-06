package Figuras_Geometricas;

public class triangulos extends Regulares{
    Double base;
    Double altura;

    public triangulos(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public triangulos(int numero_lados, String nombre, Double area, Double perimetro, Double tamaño_lado, Double base, Double altura) {
        super(numero_lados, nombre, area, perimetro, tamaño_lado);
        this.base = base;
        this.altura = altura;
    }


    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //Metodos


    @Override
    public Double calcular_area() {
        return (base*altura)/2;
    }

    @Override
    public Double calcular_perimetro() {
        return tamaño_lado*3;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+ calcular_area());
        System.out.println("Perimetro: "+calcular_perimetro());
    }


}
