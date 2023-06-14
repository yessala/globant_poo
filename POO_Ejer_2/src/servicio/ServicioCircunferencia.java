package servicio;

import java.util.Scanner;

import entidad.Circunferencia;

public class ServicioCircunferencia {
	
	private Scanner leer = new Scanner(System.in);
	
	public Circunferencia crearCircunferencia() {
		
		Circunferencia c = new Circunferencia();
		
		System.out.println("Ingrese el radio");
		c.setRadio(leer.nextDouble()); 
		
		return c;
	}
	
	/**
	 * función para calcular el área de la circunferencia
	 * 
	 * @param radio
	 * @return area
	 */
	public void area(Circunferencia c) {
		double area = Math.PI * c.getRadio() * c.getRadio();			
		System.out.println("El área de la circunferencia es " + String.format("%.2f", area));
	}
	
	/**
	 * Función para calcular el perímetro de la circunferencia
	 * 
	 * @param radio
	 * @return perimetro
	 */
	public void perimetro(Circunferencia c) {
		double perimetro = 2 * Math.PI * c.getRadio();			
		System.out.println("El perímetro de la circunferencia es " + String.format("%.2f", perimetro));
	}
}
