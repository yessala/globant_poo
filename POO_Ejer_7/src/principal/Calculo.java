package principal;

import entidad.Persona;
import servicio.ServicioPersona;

/**
 * @author yessa
 *
 */
public class Calculo {

	public static void main(String[] args) {
		
		ServicioPersona sp = new ServicioPersona();
		
		Persona p = sp.crearPersona();
		
		System.out.println(p);
		
	}

}
