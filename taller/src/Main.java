import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("""
                    -- Menu --
                    1. registrar nuevo cliente
                    2. Registrar auto
                    3. Registrar camioneta
                    4. Mostrar vehiculos
                    5. alquilar vehiculo
                    6. devolver un vehiculo
                    7. salir
                    
                    Por favor , selecciona una opcion
                    """);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Número de licencia: ");
                    String licencia = scanner.nextLine();
                    clientes.add(new Cliente(nombre, cedula, licencia));
                    break;
                case 2:
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Precio por día: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Número de puertas: ");
                    int puertas = scanner.nextInt();
                    vehiculos.add(new Auto(marca, modelo, anio, precio, puertas));
                    break;
                case 3:
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    modelo = scanner.nextLine();
                    System.out.print("Año: ");
                    anio = scanner.nextInt();
                    System.out.print("Precio por día: ");
                    precio = scanner.nextDouble();
                    System.out.print("Capacidad de carga en kg: ");
                    int carga = scanner.nextInt();
                    vehiculos.add(new Camioneta(marca, modelo, anio, precio, carga));
                    break;
                case 4:
                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (vehiculos.get(i).isDisponible()) {
                            System.out.print(i + ". ");
                            vehiculos.get(i).mostrarDetalles();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Seleccione el índice del vehículo a alquilar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < vehiculos.size() && vehiculos.get(indice).isDisponible()) {
                        System.out.print("Cantidad de días: ");
                        int dias = scanner.nextInt();
                        vehiculos.get(indice).alquilar();
                        System.out.println("Costo total: " + vehiculos.get(indice).calcularCosto(dias) + "€");
                    } else {
                        System.out.println("Índice inválido o vehículo no disponible");
                    }
                    break;
                case 6:
                    System.out.print("Seleccione el índice del vehículo a devolver: ");
                    indice = scanner.nextInt();
                    if (indice >= 0 && indice < vehiculos.size()) {
                        vehiculos.get(indice).devolver();
                        System.out.println("Vehículo devuelto correctamente.");
                    } else {
                        System.out.println("Índice inválido");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 7);
    }
}
