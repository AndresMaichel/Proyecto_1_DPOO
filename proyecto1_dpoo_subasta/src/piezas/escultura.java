package piezas;
import java.util.ArrayList;
	public abstract class escultura extends piezas {
		public escultura(String titulo, int anio, String[] autores, String lugarCreacion, boolean disponibilidadVenta,
				String[] propietariosAnteriores, String propietarioActual, String ubicacionActual) {
			super(titulo, anio, autores, lugarCreacion, disponibilidadVenta, propietariosAnteriores, propietarioActual,
					ubicacionActual);
		}

		private String material;
		private String detalle_Instalacion;
		private double dimensiones;
		private boolean Requiere_electricidad;
		private String peso;
		
	public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}

	public String getDetalle_Instalacion() {
			return detalle_Instalacion;
		}

		public void setDetalle_Instalacion(String detalle_Instalacion) {
			this.detalle_Instalacion = detalle_Instalacion;
		}

	public double getDimensiones() {
			return dimensiones;
		}

		public void setDimensiones(double dimensiones) {
			this.dimensiones = dimensiones;
		}

	public boolean isRequiere_electricidad() {
			return Requiere_electricidad;
		}

		public void setRequiere_electricidad(boolean requiere_electricidad) {
			Requiere_electricidad = requiere_electricidad;
		}

	public String getPeso() {
			return peso;
		}

		public void setPeso(String peso) {
			this.peso = peso;
		}
	
}