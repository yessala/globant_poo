package principal;

import servicio.ServicioProducto;
import entidad.Mobile;

public class Tienda {

	public static void main(String[] args) {
		ServicioProducto sp = new ServicioProducto();
		Mobile ph = sp.crearMobile();
		Mobile ph2 = sp.crearMobile();

		System.out.println(ph + "\n" + ph2 );

	}

}
