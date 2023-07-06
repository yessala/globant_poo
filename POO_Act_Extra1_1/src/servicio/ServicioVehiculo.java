/**
 * 
 */
package servicio;

import java.util.Scanner;

import entidad.Vehiculo;

/**
 * @author yessa
 *
 */
public class ServicioVehiculo {
	static Scanner leer = new Scanner(System.in);
	public Vehiculo crearVehiculo(){
		
		Vehiculo v = new Vehiculo();
		
		System.out.println("Ingrese marca del vehiculo");
		v.setMarca(leer.nextLine());
		System.out.println("Ingrese modelo del vehiculo");
		v.setModelo(leer.nextLine());
		System.out.println("Ingrese año del vehiculo");
		v.setAnio(leer.nextInt());
		leer.nextLine();
		System.out.println("Ingrese tipo de vehiculo");
		v.setTipo(leer.nextLine());
		
		return v;
		
	}
	
	public void moverse(Vehiculo tipo) {
			
		
		
	}
	
	
}
