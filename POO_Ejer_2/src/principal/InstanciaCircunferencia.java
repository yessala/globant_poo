package principal;

import entidad.Circunferencia;
import servicio.ServicioCircunferencia;

public class InstanciaCircunferencia {
	
	public static void main(String[] args) {

		ServicioCircunferencia sc = new ServicioCircunferencia();
		Circunferencia c = sc.crearCircunferencia();
		sc.area(c);
		sc.perimetro(c);
		
	}


}
