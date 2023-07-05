/**
 * 
 */
package principal;

import entidad.Mes;
import servicio.ServicioAdivinanza;

/**
 * @author yessa
 *
 */
public class Adivinanza {

	public static void main(String[] args) {
		
		ServicioAdivinanza sa = new ServicioAdivinanza();
		Mes jueguito = sa.CrearAdivinaza();
		sa.juego(jueguito);
		System.out.println();
		
	}
}
