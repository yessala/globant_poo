/**
 * 
 */
package entidad;

/**
 * @author yessa
 * 
 * */

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private String tipo;
	/**
	 * 
	 */
	public Vehiculo() {
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param tipo
	 */
	public Vehiculo(String marca, String modelo, int anio, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.tipo = tipo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + "]";
	}
	
	
	
}
