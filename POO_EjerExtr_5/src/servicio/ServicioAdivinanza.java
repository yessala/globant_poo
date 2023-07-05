/**
 * 
 */
package servicio;

import java.util.Scanner;

import entidad.Mes;

/**
 * @author yessa
 *
 */
public class ServicioAdivinanza {
	
	static Scanner leer = new Scanner(System.in);
	
	public Mes CrearAdivinaza() {
		
		Mes select = new Mes();
		
		select.setSelect((int) (Math.random()*12));;
		
		
		return select;
	
	}
	
	public void juego(Mes num) {
		System.out.println("Escriba el nombre del mes en minúscula para adivinar: ");
		num.setOption(leer.nextLine());		
		
		while (!num.getOption().equals(num.getMeses()[num.getSelect()])) {
			System.out.println("El mes ingresado es incorrecto,pruebe con otro: ");
			num.setOption(leer.nextLine());
		}
		if(num.getOption().equals(num.getMeses()[num.getSelect()])){
			System.out.println("Felicidades! acertó");
		}
	}



}
