package Logica;
abstract class Pieza {
    protected String titulo;
    protected int anio;
    protected String[] autores;
    protected String lugarCreacion;
    protected boolean disponibilidadVenta;
    protected String[] propietariosAnteriores;
    protected String propietarioActual;
    protected String ubicacionActual;

    // Constructor
    public Pieza(String titulo, int anio, String[] autores, String lugarCreacion, boolean disponibilidadVenta,
                String[] propietariosAnteriores, String propietarioActual, String ubicacionActual) {
        this.titulo = titulo;
        this.anio = anio;
        this.autores = autores;
        this.lugarCreacion = lugarCreacion;
        this.disponibilidadVenta = disponibilidadVenta;
        this.propietariosAnteriores = propietariosAnteriores;
        this.propietarioActual = propietarioActual;
        this.ubicacionActual = ubicacionActual;
    }
}