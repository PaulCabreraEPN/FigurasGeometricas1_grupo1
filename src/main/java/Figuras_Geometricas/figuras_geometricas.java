package Figuras_Geometricas;

public class figuras_geometricas {
    String nombre;
    int numero_lados;

    public figuras_geometricas() {
    }


    public figuras_geometricas(int numero_lados, String nombre) {
        this.numero_lados = numero_lados;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    public void setNumero_lados(int numero_lados) {
        this.numero_lados = numero_lados;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero Lados: " + numero_lados);

    }
}
