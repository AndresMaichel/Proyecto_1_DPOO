package menu;

import java.util.Scanner;

public class MenuAdministrador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú	
        while (true) {
            System.out.println("Seleccione el trabajo a realizar:");
            System.out.println("0. Salir");
            System.out.println("1. Agregar Pieza a inventario");
            System.out.println("2. Eliminar Pieza de inventario");
            System.out.println("3. Consultar Inventario");
            System.out.println("4. Aprovar Pago");
            System.out.println("Ingrese el número correspondiente a la opción:");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo del menú...");
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("Agregando Pieza: ");
                        // Lógica Agregar Pieza
                        break;
                    case 2:
                        System.out.println("Eliminando Pieza: ");
                        // Lógica Eliminar Pieza
                        break;
                    case 3:
                        System.out.println("Consultando Inventario: ");
                        // Lógica Consultar Inventario
                        break;
                    case 4:
                        System.out.println("Aprovar Pago: ");
                        // Lógica Aprovar Pago
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