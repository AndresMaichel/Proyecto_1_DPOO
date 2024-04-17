package Logica;

import java.util.Date;

public class Administrador extends Usuario {
    // Constructor
    public Administrador(String nombre, int id, String correo, String password, Date fechaNacimiento) {
        // Llamamos al constructor de la clase padre (Usuario)
        super(nombre, id, correo, password, fechaNacimiento, "administrador");
    }

    // Otros métodos específicos de la clase Administrador
    // ...
}
