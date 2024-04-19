package logica;

import java.util.ArrayList;

public abstract class escultura extends piezas {
	public escultura(String titulo, int anio, String[] autores, String lugarCreacion, boolean disponibilidadVenta,
			String[] propietariosAnteriores, String propietarioActual, String ubicacionActual) {
		super(titulo, anio, autores, lugarCreacion, disponibilidadVenta, propietariosAnteriores, propietarioActual,
				ubicacionActual);
	}

	private boolean electricidad;
	private String detalles_instalacion;
	private float peso;

	public boolean isElectricidad() {
		return electricidad;
	}
	public void setElectricidad(boolean electricidad) {
		this.electricidad = electricidad;
	}
	public String getDetalles_instalacion() {
		return detalles_instalacion;
	}
	public void setDetalles_instalacion(String detalles_instalacion) {
		this.detalles_instalacion = detalles_instalacion;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}

