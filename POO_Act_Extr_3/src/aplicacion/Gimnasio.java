/**
 * 
 */
package aplicacion;

import java.util.Scanner;

import aplicacion.servicio.ServicioCliente;
import aplicacion.servicio.ServicioRutina;

/**
 * @author yessa
 * 
 * 
 */
public class Gimnasio {
	
	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ServicioCliente sc = new ServicioCliente();
		ServicioRutina sr = new ServicioRutina();
		
		menu(sc, sr);
		
	}
	
	
	
	public static void menu(ServicioCliente sc, ServicioRutina sr) {
		int option;
		do {
		System.out.println("BIENVENIDO/A AL SISTEMA DE FATNESS GYM");	
		System.out.println("Seleccione la opcion con la que desea trabajar: \n1. Cliente\n2. Rutina\n3. Salir.");
		option = leer.nextInt();
		
		switch (option) {
		case 1 -> sc.menu();
		case 2 -> sr.menu();
		case 3 -> System.out.println("Hasta Luego!!");		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}while (option != 3);
	}
	
}
