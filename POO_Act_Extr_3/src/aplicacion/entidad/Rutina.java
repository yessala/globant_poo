/**
 * 
 */
package aplicacion.entidad;

/**
 * @author yessa
 * 
 * Crea una clase de entidad llamada "Rutina" con los siguientes atributos:
 * id, nombre, duracion, nivelDificultad, descripcion
 */
public class Rutina {
	private int id;
	private String nombre;
	private int duracion;
	private String nivelDificultad;
	private String descripcion;
	/**
	 *Constructor default 
	 */
	public Rutina() {
	}
	/**
	 * @param id
	 * @param nombre
	 * @param duracion
	 * @param nivelDificultad
	 * @param descripcion
	 */
	public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.nivelDificultad = nivelDificultad;
		this.descripcion = descripcion;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the nivelDificultad
	 */
	public String getNivelDificultad() {
		return nivelDificultad;
	}
	/**
	 * @param nivelDificultad the nivelDificultad to set
	 */
	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Rutina [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad="
				+ nivelDificultad + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
