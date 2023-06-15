package principal;

import entidad.Cuenta;
import servicios.ServicioCuenta;

public class Principal {

	public static void main(String[] args) {
		
		ServicioCuenta sc = new ServicioCuenta();
		Cuenta c = sc.crearCuenta();
		
		c.ingresar(5000);
		c.retirar(250);
		
		
		c.consultarSaldo();
		
		
	}
	

}
