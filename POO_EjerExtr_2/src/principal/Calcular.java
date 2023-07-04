/**
 * 
 */
package principal;

import entidad.Puntos;
import servicio.ServicioPunto;

/**
 * @author yessa
 *Clase principal para instaciar el oobjeto
 */
public class Calcular {

	public static void main(String[] args) {

		ServicioPunto sp = new ServicioPunto();
		Puntos p = sp.crearPuntos();
		System.out.println();
		System.out.println("La distancia entre el punto A(" + p.getX1() + "," + p.getY1() + ") y el punto B("
				+ p.getX2() + "," + p.getY2() + ") es: ");
		System.out.println(String.format("%.2f", sp.calcularDistancia(p)));
	}

}
