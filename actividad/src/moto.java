public class moto extends Vehiculo{

    private int cilindrada;

    public moto(String marca, String modelo, int anioMoto, double precioBase, int cilindrada) {
        super(marca, modelo, anioMoto, precioBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + "cc";
    }
}