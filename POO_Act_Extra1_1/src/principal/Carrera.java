/**
 * 
 */
package principal;

import entidad.Vehiculo;
import servicio.ServicioVehiculo;

/**
 * @author yessa
 *
 */
public class Carrera {

	public static void main(String[] args) {
		ServicioVehiculo sv = new ServicioVehiculo();
		Vehiculo v = sv.crearVehiculo();
		
		System.out.println(v);
	}
}
