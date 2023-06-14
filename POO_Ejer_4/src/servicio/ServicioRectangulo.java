package servicio;

import java.util.Scanner;

import entidad.Rectangulo;

public class ServicioRectangulo {

	private Scanner leer = new Scanner(System.in);

	public Rectangulo crearRectangulo() {

		Rectangulo r = new Rectangulo();

		System.out.println("Ingrese la base del rectángulo");
		r.setBase(leer.nextInt());
		System.out.println("Ingrese la altura del rectángulo");
		r.setAltura(leer.nextInt());

		return r;
	}

	public void superficie(Rectangulo b, Rectangulo a) {

		System.out.println("La superficie del rectángulo es " + (b.getBase()*a.getAltura()));

	}

	public void perimetro (Rectangulo b, Rectangulo a) {

		System.out.println("El perimetro del rectángulo es " + (b.getBase()*a.getAltura()*2));

	}

	public void dibujar(Rectangulo b, Rectangulo a) {

		//Linea superior
		for (int i = 0; i < b.getBase(); i++) {
			System.out.print("* ");
		}
		System.out.println();//salto de línea

		//Lineas centro
		for (int i = 0; i < a.getAltura()-2; i++) {
			System.out.print("* ");
			for (int j = 0; j < b.getBase()-2; j++) {
				System.out.print("  ");//espacio vacio
			}
			System.out.println("*");
		}

		//Linea inferior
		for (int i = 0; i < b.getBase(); i++) {
			System.out.print("* ");

		} 


	}
}
