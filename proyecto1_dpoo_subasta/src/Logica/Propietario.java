package Logica;

import java.util.Date;

public class Propietario extends Usuario {
    // Constructor
    public Propietario(String nombre, int id, String correo, String password, Date fechaNacimiento) {
        // Llamamos al constructor de la clase padre (Usuario)
        super(nombre, id, correo, password, fechaNacimiento, "propietario");
    }

    // Otros métodos específicos de la clase Propietario
    // ...
}
