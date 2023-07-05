/**
 * 
 */
package entidad;

/**
 * @author yessa
 *
 *Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:

 */
public class Nif {
	
	private int dni;
	private char letra;
	/**
	 * Constructors
	 */
	public Nif() {
	}
	
	public Nif(int dni, char letra) {
		this.dni = dni;
		this.letra = letra;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "NIF [dni=" + dni + ", letra=" + letra + "]";
	}
	
	

}
