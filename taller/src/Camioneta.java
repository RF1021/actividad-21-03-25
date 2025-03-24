import java.util.*;

class Camioneta extends Vehiculo {
    private int capacidadCarga;

    public Camioneta(String marca, String modelo, int anio, double precioPorDia, int capacidadCarga) {
        super(marca, modelo, anio, precioPorDia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camioneta: " + marca + " " + modelo + ", Año: " + anio + ", Precio por día: " + precioPorDia + "€, Capacidad de carga: " + capacidadCarga + "kg, Disponible: " + disponible);
    }
}