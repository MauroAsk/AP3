package ap3.askenazi.mauro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDocentes {
    private static List<Docente> docentes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Ingresar Docente");
            System.out.println("2. Buscar Docente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarDocente();
                    break;
                case 2:
                    buscarDocente();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private static void ingresarDocente() {
        try {
            System.out.print("DNI: ");
            int dni = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            int telefono = scanner.nextInt();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("legajo: ");
            int legajo = scanner.nextInt();

           Docente docente = new Docente(dni, nombre, apellido, direccion, telefono, email, cargo, legajo);
            docentes.add(docente);
            System.out.println("Docente ingresado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarDocente() {
        System.out.print("Ingrese nombre, apellido o DNI para buscar: ");
        String busqueda = scanner.nextLine();
        boolean encontrado = false;

        for (Docente docente : docentes) {
            if (docente.getNombre().equalsIgnoreCase(busqueda) ||
                docente.getApellido().equalsIgnoreCase(busqueda) ||
                String.valueOf(docente.getDni()).equals(busqueda)) {
                System.out.println("Docente encontrado: " + docente.getNombre() + " " + docente.getApellido()+ " " + docente.getDni());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Docente no encontrado.");
        }
    }
}