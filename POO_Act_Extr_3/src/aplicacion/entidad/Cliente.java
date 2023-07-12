/**
 * 
 */
package aplicacion.entidad;

/**
 * @author yessa
 * 
 * Crea una clase de entidad llamada "Cliente" con los siguientes atributos:
 * id, nombre, edad, altura, peso, objetivo (cadena de caracteres)
 */
public class Cliente {
	private int id;
	private String nombre;
	private double altura;
	private double peso;
	private String objetivo;
	/**
	 * Constructor default
	 */
	public Cliente() {
	}
	/**
	 * @param id
	 * @param nombre
	 * @param altura
	 * @param peso
	 * @param objetivo
	 */
	public Cliente(int id, String nombre, double altura, double peso, String objetivo) {
		this.id = id;
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.objetivo = objetivo;
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
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the objetivo
	 */
	public String getObjetivo() {
		return objetivo;
	}
	/**
	 * @param objetivo the objetivo to set
	 */
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", objetivo="
				+ objetivo + "]";
	}
	
	
	
	
}
