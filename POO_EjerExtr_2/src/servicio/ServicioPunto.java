/**
 * 
 */
package servicio;

import java.util.Scanner;

import entidad.Puntos;

/**
 * @author yessa
 *Clase que crea el objeto Puntos
 *con el metodo de calcular la distancia.
 */
public class ServicioPunto {

	static Scanner sc = new Scanner(System.in);

	public Puntos crearPuntos() {

		Puntos p = new Puntos();

		System.out.print("Ingrese la coordenada del punto x1: ");
		p.setX1(sc.nextInt());
		System.out.print("Ingrese la coordenada del punto x2: ");
		p.setX2(sc.nextInt());
		System.out.print("Ingrese la coordenada del punto y1: ");
		p.setY1(sc.nextInt());
		System.out.print("Ingrese la coordenada del punto y2: ");
		p.setY2(sc.nextInt());

		return p;
	}

	public double calcularDistancia(Puntos pto) {

		double distance = Math
				.sqrt((Math.pow((pto.getX2() - pto.getX1()), 2) + Math.pow((pto.getY2() - pto.getY1()), 2)));

		return distance;
	}

}
