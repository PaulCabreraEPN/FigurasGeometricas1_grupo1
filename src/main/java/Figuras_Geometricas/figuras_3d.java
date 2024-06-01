package Figuras_Geometricas;

public class figuras_3d extends figuras_geometricas {

    String nombre_figura_3d;
    int numero_caras;
    double area;
    double volumen;

    public figuras_3d() {}
    public figuras_3d(String nombre_figura_3d, int numero_caras) {
        this.nombre_figura_3d = nombre_figura_3d;
        this.numero_caras = numero_caras;
    }

    public double calcular_area() {
        return area;
    }
    public double calcular_volumen() {
        return volumen;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre del figura 3d: " + nombre_figura_3d);
        System.out.println("El núemro de caras: " + numero_caras);
    }


}
