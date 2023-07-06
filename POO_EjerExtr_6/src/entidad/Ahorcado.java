/**
 * 
 */
package entidad;

import java.util.Arrays;

/**
 * @author yessa
 *
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado. 

 */
public class Ahorcado {
	
	private String[] word;
	private int encontradas;
	private int intentos;
	private String letra;
	/**
	 * default constructor
	 */
	public Ahorcado() {
	}
	/**
	 * @param word
	 * @param encontradas
	 * @param intentos
	 */
	public Ahorcado(String[] word, int encontradas, int intentos, String letra) {
		this.word = word;
		this.encontradas = encontradas;
		this.intentos = intentos;
		this.letra = letra;
	}
	/**
	 * @return the word
	 */
	public String[] getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String[] word) {
		this.word = word;
	}
	/**
	 * @return the encontradas
	 */
	public int getEncontradas() {
		return encontradas;
	}
	/**
	 * @param encontradas the encontradas to set
	 */
	public void setEncontradas(int encontradas) {
		this.encontradas = encontradas;
	}
	/**
	 * @return the intentos
	 */
	public int getIntentos() {
		return intentos;
	}
	/**
	 * @param intentos the intentos to set
	 */
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	/**
	 * @return the letra
	 */
	public String getLetra() {
		return letra;
	}
	/**
	 * @param letra the letra to set
	 */
	public void setLetra(String letra) {
		this.letra = letra;
	}
	@Override
	public String toString() {
		return "Ahorcado [word=" + Arrays.toString(word) + ", encontradas=" + encontradas + ", intentos=" + intentos
				+ ", letra=" + letra + "]";
	}

	
	
	
	
	

}
