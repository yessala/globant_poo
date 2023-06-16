package servicios;

import java.util.Scanner;

import entidad.Cuenta;

public class ServicioCuenta {

		private Scanner leer = new Scanner(System.in);

		public Cuenta crearCuenta() {
			Cuenta c = new Cuenta();
			
			System.out.println("Ingrese número de cuenta");
			c.setNumeroCta(leer.nextInt());
			//consumir salto de linea para que no me deje colocar el String siguiente
			//por eso la linea de codigo 18, fuente de solucion
			//https://parzibyte.me/blog/2021/06/22/java-problemas-scanner-no-hace-pausa/
			leer.nextLine();
			System.out.println("Ingrese su nombre");
			c.setNombre(leer.nextLine());
			System.out.println("Ingrese su DNI");
			c.setDni(leer.nextInt());
			
			return c;
		}
		

}
