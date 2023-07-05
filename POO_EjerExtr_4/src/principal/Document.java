/**
 * 
 */
package principal;

import entidad.Nif;
import servicio.ServicioNif;

/**
 * @author yessa
 *
 */
public class Document {
	
	public static void main(String[] args) {
		ServicioNif sn = new ServicioNif();
		Nif n = sn.crearNif();
		
		sn.mostrar(n);
	}
}
