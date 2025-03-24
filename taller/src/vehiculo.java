import java.util.*;

class Vehiculo {
    protected String marca, modelo;
    protected int anio;
    protected double precioPorDia;
    protected boolean disponible;

    public Vehiculo(String marca, String modelo, int anio, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioPorDia = precioPorDia;
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void alquilar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public double calcularCosto(int dias) {
        double total = dias * precioPorDia;
        return (dias > 7) ? total * 0.9 : total;
    }

    public void mostrarDetalles() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Año: " + anio + ", Precio por día: " + precioPorDia + "€, Disponible: " + disponible);
    }
}
