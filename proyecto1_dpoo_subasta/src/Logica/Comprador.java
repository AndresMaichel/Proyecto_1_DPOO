package Logica;

import java.util.Date;

public class Comprador extends Usuario {
    // Constructor
    public Comprador(String nombre, int id, String correo, String password, Date fechaNacimiento) {
        // Llamamos al constructor de la clase padre (Usuario)
        super(nombre, id, correo, password, fechaNacimiento, "comprador");
    }

    // Otros métodos específicos de la clase Comprador
    // ...
}
