package Presentacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Principal {

    // Mp. almacenar usuarios y contraseñas
    private static Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú
        while (true) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    registrarUsuario(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para iniciar sesión
    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su nombre de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");

            // Menú después de iniciar sesión
            while (true) {
                System.out.println("1. Cliente");
                System.out.println("2. Usuario");
                System.out.println("3. Cerrar sesión");
                System.out.println("Seleccione una opción:");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción de cliente.");
                        // Aquí puedes agregar la lógica para el rol de cliente
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción de usuario.");
                        // Aquí puedes agregar la lógica para el rol de usuario
                        break;
                    case 3:
                        System.out.println("Cerrando sesión...");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }

    // Método para registrar un nuevo usuario
    private static void registrarUsuario(Scanner scanner) {
        System.out.println("Ingrese un nuevo nombre de usuario:");
        String usuario = scanner.nextLine();

        // Verificar si el usuario ya existe
        if (usuarios.containsKey(usuario)) {
            System.out.println("El nombre de usuario ya está en uso. Intente con otro.");
            return;
        }

        System.out.println("Ingrese una contraseña para el nuevo usuario:");
        String contraseña = scanner.nextLine();
        usuarios.put(usuario, contraseña);
        System.out.println("Usuario registrado correctamente.");
    }
}
