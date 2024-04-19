package logica;

import java.util.Scanner;

public class MenuTrabajadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú	
        while (true) {
            System.out.println("Seleccione el tipo de trabajador:");
            System.out.println("0. Salir");
            System.out.println("1. Administrador");
            System.out.println("2. Cajero");
            System.out.println("3. Operador");
            System.out.println("Ingrese el número correspondiente a la opción:");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo del menú...");
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("Has seleccionado Administrador.");
                        // Aquí puedes agregar la lógica para el rol de Administrador
                        break;
                    case 2:
                        System.out.println("Has seleccionado Cajero.");
                        // Aquí puedes agregar la lógica para el rol de Cajero
                        break;
                    case 3:
                        System.out.println("Has seleccionado Operador.");
                        // Aquí puedes agregar la lógica para el rol de Operador
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
}
