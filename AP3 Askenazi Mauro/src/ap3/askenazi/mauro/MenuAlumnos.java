
package ap3.askenazi.mauro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAlumnos {
    private static List<Alumno> alumnos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private static void ingresarAlumno() {
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
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();

            Alumno alumno = new Alumno(dni, nombre, apellido, direccion, telefono, email, curso, matricula);
            alumnos.add(alumno);
            System.out.println("Alumno ingresado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarAlumno() {
        System.out.print("Ingrese nombre, apellido o DNI para buscar: ");
        String busqueda = scanner.nextLine();
        boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(busqueda) ||
                alumno.getApellido().equalsIgnoreCase(busqueda) ||
                String.valueOf(alumno.getDni()).equals(busqueda)) {
                System.out.println("Alumno encontrado: " + alumno.getNombre() + " " + alumno.getApellido()+ " " + alumno.getDni());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }
}