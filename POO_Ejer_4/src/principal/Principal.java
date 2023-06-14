package principal;

import entidad.Rectangulo;
import servicio.ServicioRectangulo;

public class Principal {

	public static void main(String[] args) {
		ServicioRectangulo sr = new ServicioRectangulo();
		Rectangulo r = sr.crearRectangulo();
		
		sr.superficie(r, r);
		sr.perimetro(r, r);	
		
		System.out.println(r);
		
	}

}
