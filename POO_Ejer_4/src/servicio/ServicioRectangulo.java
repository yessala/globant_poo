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
	
}
