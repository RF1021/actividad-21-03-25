import java.util.*;

class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, double precioPorDia, int numPuertas) {
        super(marca, modelo, anio, precioPorDia);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Auto: " + marca + " " + modelo + ", Año: " + anio + ", Precio por día: " + precioPorDia + "€, Puertas: " + numPuertas + ", Disponible: " + disponible);
    }
}

