package principal;

import entidad.Rectangulo;
import servicio.ServicioRectangulo;

public class Principal {

	public static void main(String[] args) {
		ServicioRectangulo sr = new ServicioRectangulo();
		Rectangulo r = sr.crearRectangulo();
		System.out.println(r);
		System.out.println();
		sr.superficie(r, r);
		System.out.println();
		sr.perimetro(r, r);	
		System.out.println();
		System.out.println("Dibujando el rectángulo");
		sr.dibujar(r, r);
		
	}

}
