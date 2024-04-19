package menu;
import java.util.Scanner;

public class MenuPropietario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú	
        while (true) {
            System.out.println("Seleccione el tipo de cliente:");
            System.out.println("0. Salir");
            System.out.println("1. Vender o Subastar Pieza");
            System.out.println("2. Mis Piezas");
            System.out.println("3. Piezas Vendidas");
            System.out.println("Ingrese el número correspondiente a la opción:");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo del menú...");
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("Vender o Subastar Piezas: ");
                        break;
                    case 2:
                        System.out.println("Mis Piezas: ");
                        break;
                    case 3:
                        System.out.println("Piezas Vendidas: ");
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
