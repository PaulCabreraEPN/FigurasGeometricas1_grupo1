package Figuras_3D;
import Figuras_Geometricas.figuras_geometricas;

public class figuras_3d extends figuras_geometricas {

    String nombre_figura_3d;
    int numero_caras;

    public figuras_3d() {}
    public figuras_3d(String nombre_figura_3d, int numero_caras) {
        this.nombre_figura_3d = nombre_figura_3d;
        this.numero_caras = numero_caras;
    }

    public void mostrar() {
        System.out.println("Nombre del figura 3d: " + nombre_figura_3d);
        System.out.println("El núemro de caras: " + numero_caras);
    }


}
