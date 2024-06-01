package Figuras_Geometricas;

public class piramide_3d extends figuras_3d {
    double altura;
    double lado;
    double apotema;

    public piramide_3d(double altura, double lado, double apotema) {
        super("Piramide", 5);
        this.altura = altura;
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcular_area(){
        double area=(lado*lado)+ 2*lado*apotema;
        return area;
    }

    @Override
    public double calcular_volumen(){
        double volumen=  (lado*lado*altura)/3;
        return volumen;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Valor lado: "+lado);
        System.out.println("Altura: "+altura);
        System.out.println("Apotema: "+apotema);
        System.out.println("Area: "+calcular_area());
        System.out.println("Volumen: "+calcular_volumen());

    }
}
