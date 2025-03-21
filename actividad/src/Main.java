import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("""
            --- Concecionario Los Mendez ---
            1. Agregar Auto
            2. Agregar Motocicleta
            3. Mostrar Lista de Vehículos
            4. Salir
            Seleccione una opción 
            """);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.next();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modeloAuto = scanner.next();
                    System.out.print("Ingrese el año del auto: ");
                    int anioAuto = scanner.nextInt();
                    System.out.print("Ingrese el precio base del auto: ");
                    double precioAuto = scanner.nextDouble();
                    System.out.print("Ingrese el número de puertas: ");
                    int puertas = scanner.nextInt();

                    auto auto = new auto(marcaAuto, modeloAuto, anioAuto, precioAuto, puertas);
                    vehiculos.add(auto);
                    System.out.println("agregado correctamente.");
                }
                case 2 -> {
                    System.out.print("Ingrese la marca de la motocicleta: ");
                    String marcaMoto = scanner.next();
                    System.out.print("Ingrese el modelo de la motocicleta: ");
                    String modeloMoto = scanner.next();
                    System.out.print("Ingrese el año de la motocicleta: ");
                    int añoMoto = scanner.nextInt();
                    System.out.print("Ingrese el precio base de la motocicleta: ");
                    double precioMoto = scanner.nextDouble();
                    System.out.print("Ingrese la cilindrada de la motocicleta: ");
                    int cilindrada = scanner.nextInt();

                    moto moto = new moto(marcaMoto, modeloMoto, añoMoto, precioMoto, cilindrada);
                    vehiculos.add(moto);
                    System.out.println("agregada correctamente.");
                }
                case 3 -> {
                    System.out.println("--- lista de vehiculos ---");
                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println(vehiculos.get(i).toString());
                    }
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}