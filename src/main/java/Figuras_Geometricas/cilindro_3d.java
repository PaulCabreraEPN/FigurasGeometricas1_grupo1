package Figuras_Geometricas;

public class cilindro_3d extends figuras_3d{
    double radio;
    double pi;
    double altura;

    public cilindro_3d(double radio,double altura) {
        super("Cilindro", 3);
        this.radio = radio;
        this.pi = 3.14159265358979323846;
        this.altura = altura;
    }

    @Override
    public double calcular_area(){
        double area=2*pi*radio*(radio+altura);
        return area;
    }

    @Override
    public double calcular_volumen(){
        double volumen= pi * (radio*radio) * altura;
        return volumen;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcular_area());
        System.out.println("Volumen: " + calcular_volumen());
    }

}
