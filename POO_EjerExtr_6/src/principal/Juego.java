/**
 * 
 */
package principal;

import entidad.Ahorcado;
import servicio.ServicioAhorcado;

/**
 * @author yessa
 *
 */
public class Juego {
	public static void main(String[] args) {
		ServicioAhorcado sh = new ServicioAhorcado();
		Ahorcado juego = sh.crearJuego();

		System.out.println(juego);
		sh.juego(juego);
	}
}
