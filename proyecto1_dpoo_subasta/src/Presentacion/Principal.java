package Presentacion;
import java.util.Scanner;
import Logica.Usuario;
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Menú:");
			System.out.println("0. Salir ");
			System.out.println("1. Registrar Usuario ");
			System.out.println("1. Registrar Usuario ");
			System.out.print("Ingrese el número de la opción deseada: ");


			opcion = scanner.nextInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo del programa...\n");
				break;
			case 1:
				System.out.println("Registrando nuevo usuario...\n");
				
				Usuario.menu();

				break;
			default:
				System.out.println("Opción no válida. Seleccione una opción válida.\n");
				break;
			}
		} while (opcion != 0);

		scanner.close();
	}
}

