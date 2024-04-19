package menu;

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
					System.out.println("Administrador: ");
					MenuAdministrador.main(null);
					break;
				case 2:
					System.out.println("Cajero: ");
					MenuCajero.main(null);
					break;
				case 3:
					System.out.println("Operador: ");
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
