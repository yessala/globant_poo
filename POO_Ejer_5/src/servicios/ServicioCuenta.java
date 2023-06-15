package servicios;

import java.util.Scanner;

import entidad.Cuenta;

//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 

public class ServicioCuenta {

		private Scanner leer = new Scanner(System.in);
//		
//		private int numeroCta;
//		private long dni;
//		private int saldoActual;
		
		public Cuenta crearCuenta() {
			Cuenta c = new Cuenta();
			
			System.out.println("Ingrese número de cuenta");
			c.setNumeroCta(leer.nextInt());
			System.out.println("Ingrese su DNI");
			c.setDni(leer.nextInt());
			
			return c;
		}
		

}
