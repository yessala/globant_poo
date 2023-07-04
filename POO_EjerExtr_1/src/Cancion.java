/**
 * 
 */

/**
 * @author yessa
 * 
 *Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
 
public class Cancion {
	private String tittle;
	private String author;
	public Cancion() {
	}
	public Cancion(String tittle, String author) {
		this.tittle = tittle;
		this.author = author;
	}
	/**
	 * @return the tittle
	 */
	public String getTittle() {
		return tittle;
	}
	/**
	 * @param tittle the tittle to set
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Cancion [tittle=" + tittle + ", author=" + author + "]";
	}
	
	
}
