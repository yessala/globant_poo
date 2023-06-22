package principal;

import entidad.Matematica;
import servicio.ServicioMatematica;

/**
 * @author yessa
 *
 */
public class Operacion {

	public static void main(String[] args) {
		
		ServicioMatematica sm = new ServicioMatematica();
		Matematica m = sm.crearMatematica();
		
		System.out.println(m);
		sm.devolverMayor(m);
		sm.calcularPotencia(m);
		sm.calculaRaiz(m);

	}

}
