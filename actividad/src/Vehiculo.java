public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase * 1.10;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Precio Final: " + calcularPrecioFinal();
    }
}