package menu;

import java.util.Scanner;

public class MenuComprador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Menú	
		while (true) {
			System.out.println("Seleccione el tipo de cliente:");
			System.out.println("0. Salir");
			System.out.println("1. Ver el menu de compra: ");
			System.out.println("Ingrese el número correspondiente a la opción:");

			try {
				int opcion = Integer.parseInt(scanner.nextLine());

				switch (opcion) {
				case 0:
					System.out.println("Saliendo del menú...");
					scanner.close();
					return;
				case 1:
					System.out.println("Menu de compras: ");
					MenuPropietario.main(null);
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
