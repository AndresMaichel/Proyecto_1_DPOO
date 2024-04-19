package piezas;

import java.util.ArrayList;

public abstract class pintura extends piezas {
	public pintura(String titulo, int anio, String[] autores, String lugarCreacion, boolean disponibilidadVenta,
			String[] propietariosAnteriores, String propietarioActual, String ubicacionActual) {
		super(titulo, anio, autores, lugarCreacion, disponibilidadVenta, propietariosAnteriores, propietarioActual,
				ubicacionActual);
	}
	private String material;
	private String tamanio;
	private String lienzo;

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getLienzo() {
		return lienzo;
	}

	public void setLienzo(String lienzo) {
		this.lienzo = lienzo;
	}



}


