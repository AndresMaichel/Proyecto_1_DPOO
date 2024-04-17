package Logica;
import java.util.Date;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private int id;
	private String correo;
	private String password;
	private Date fechaNacimiento;
	private String rolUsuario;

	// Constructor
	public Usuario(String nombre, int id, String correo, String password, Date fechaNacimiento, String rolUsuario) {
		this.nombre = nombre;
		this.id = id;
		this.correo = correo;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.rolUsuario = rolUsuario;
	}

	public static void menu() {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite una opcion de Usuario: ");
			System.out.println("0. Salir");
			System.out.println("1. Administrador");
			System.out.println("2. Comprador");
			System.out.println("3. Empleado");
			System.out.println("4. Propietario");
			op = sc.nextInt();
			try {
				if(op == 1) {
					Administrador(sc);
				}else if(op == 2) {
					Comprador(sc);
				}else if (op== 3) {
					Empleado(sc);
				}else if (op== 4) {
					Propietario(sc);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 

		}
		while(op != 0);
		sc.close();

		opcion = scanner.nextInt();

		switch (opcion) {
		case 0:
			System.out.println("Saliendo del programa...\n");
			break;
		case 1:
			System.out.println("Registrando nuevo usuario...\n");



			break;
		default:
			System.out.println("Opción no válida. Seleccione una opción válida.\n");
			break;
		}
	} while (opcion != 0);

	scanner.close();
}
}




