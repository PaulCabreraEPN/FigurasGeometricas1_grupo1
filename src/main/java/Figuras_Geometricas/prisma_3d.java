package Figuras_Geometricas;

public class prisma_3d extends figuras_3d{
    double base;
    double altura;
    double profundidad;

    public prisma_3d(double base, double altura, double profundidad) {
        super("Prisma", 6);
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    @Override
    public double calcular_area(){
        double area_base=base*profundidad;
        double area_altura=base*altura;
        double area=2*altura*(base+profundidad)+2*(area_base);
        return area;
    }

    @Override
    public double calcular_volumen(){
        double area_base=base*profundidad;
        double volumen=area_base*altura;
        return volumen;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Profundidad: "+profundidad);
        System.out.println("Area: "+ calcular_area());
        System.out.println("Volumen: "+calcular_volumen());
    }
}
