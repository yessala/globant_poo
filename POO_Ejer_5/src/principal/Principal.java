package principal;

import entidad.Cuenta;
import servicios.ServicioCuenta;

public class Principal {

	public static void main(String[] args) {
		
		ServicioCuenta sc = new ServicioCuenta();
		Cuenta c = sc.crearCuenta();
		
		System.out.println(c);
		
		
	}

}
