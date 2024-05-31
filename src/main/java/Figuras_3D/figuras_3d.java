package Figuras_3D;
import Figuras_Geometricas.figuras_geometricas;

public class figuras_3d extends figuras_geometricas {

    String nombre_figura_3d;

    public figuras_3d() {}
    public figuras_3d(String nombre_figura_3d) {
        this.nombre_figura_3d = nombre_figura_3d;
    }

    public void mostrar() {
        System.out.println("Nombre del figura 3d: " + nombre_figura_3d);
    }


}
