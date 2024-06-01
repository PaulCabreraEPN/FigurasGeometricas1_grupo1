package Figuras_Geometricas;

public class cono_3d extends figuras_3d{
    double altura;
    double radio;
    double apotema;
    double pi;

    public cono_3d(double altura, double radio, double apotema) {
        super("cono", 2);
        this.altura = altura;
        this.radio = radio;
        this.apotema = apotema;
        this.pi = 3.14159265358979323846;
    }

    @Override
    public double calcular_area(){
        double area=pi*radio*apotema+pi*(radio*radio);
        return area;
    }

    @Override
    public double calcular_volumen(){
        double volumen=  (pi*(radio*radio)*altura)/3;
        return volumen;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Valor radio: "+radio);
        System.out.println("Altura: "+altura);
        System.out.println("Apotema: "+apotema);
        System.out.println("Area: "+calcular_area());
        System.out.println("Volumen: "+calcular_volumen());

    }
}
