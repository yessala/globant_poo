package servicios;

import java.util.Scanner;

import entidad.Cuenta;

public class ServicioCuenta {

		private Scanner leer = new Scanner(System.in);

		public Cuenta crearCuenta() {
			Cuenta c = new Cuenta();
			
			System.out.println("Ingrese número de cuenta");
			c.setNumeroCta(leer.nextInt());
			System.out.println("Ingrese su nombre");
			c.setNombre(leer.next());
			System.out.println("Ingrese su DNI");
			c.setDni(leer.nextInt());
			
			return c;
		}
		

}
