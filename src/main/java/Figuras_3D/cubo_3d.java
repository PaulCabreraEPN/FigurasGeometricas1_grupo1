package Figuras_3D;

public class cubo_3d extends figuras_3d{
    double valor_lado;

    public cubo_3d(double valor_lado) {
        super("Cubo", 6);
        this.valor_lado = valor_lado;
    }

    private double calcular_area(){
        double area= 6*(valor_lado*valor_lado);
        return area;
    }

    private double calcular_volumen(){
        double volumen= valor_lado*valor_lado*valor_lado;
        return volumen;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Medida lados: " + valor_lado);
        System.out.println("Area: " + calcular_area());
        System.out.println("Volumen: " + calcular_volumen());
    }


}
