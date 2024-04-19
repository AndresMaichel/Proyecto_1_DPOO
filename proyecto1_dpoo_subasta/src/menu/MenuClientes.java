package menu;

import java.util.Scanner;

import consola.SistemaLogin;

public class MenuClientes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Menú	
		while (true) {
			System.out.println("Seleccione el tipo de cliente:");
			System.out.println("1. Comprador");
			System.out.println("2. Propietario");
			System.out.println("3. Salir del programa...");
			System.out.println("Ingrese el número correspondiente a la opción:");

			try {
				int opcion = Integer.parseInt(scanner.nextLine());

				switch (opcion) {
				case 1:
					System.out.println("Has seleccionado Comprador.");
					MenuComprador.main(null);
					break;
				case 2:
					System.out.println("Has seleccionado Propietario.");
					MenuPropietario.main(null);
					break;
				case 3:
					System.out.println("Devolviendose...");
					SistemaLogin.main(null);;
					return;
				default:
					System.out.println("Opción no válida. Por favor, selecciona nuevamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor, ingrese un número válido.");
			}
		}
	}
}
