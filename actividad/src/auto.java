public class auto extends Vehiculo{
    private int puertas;

    public auto(String marca, String modelo, int anio, double precioBase, int puertas) {
        super(marca, modelo, anio, precioBase);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + puertas;
    }
}