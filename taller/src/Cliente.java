import java.util.*;

class Cliente {
    private String nombre, cedula, licencia;

    public Cliente(String nombre, String cedula, String licencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }
}
