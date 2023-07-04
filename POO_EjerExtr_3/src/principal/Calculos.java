/**
 * 
 */
package principal;

import entidad.Raices;
import servicio.ServicioRaices;

/**
 * @author yessa
 *
 */
public class Calculos {
	
	public static void main(String[] args) {
		
		ServicioRaices sr = new ServicioRaices();
		Raices r = sr.crearRaices();
		
		System.out.println(r);
		
		sr.calcular(r);
	}
}
