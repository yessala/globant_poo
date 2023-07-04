package servicio;
import java.util.Scanner;

import entidad.Pelicula;

public class ServicioPelicula {
	static Scanner leer = new Scanner(System.in);
	
	public Pelicula crearPelicula() {
	
		Pelicula p = new Pelicula();
//		private String titulo;
//		private String genero;
//		private int anio;
//		private int duracion;
		System.out.println("Ingrese nombre de la película.");
		p.setTitulo(leer.nextLine());
		System.out.println("Ingrese el género de la película.");
		p.setGenero(leer.nextLine());
		System.out.println("Ingrese el año de la pelicula");
		p.setAnio(leer.nextInt());
		System.out.println("Ingrese duración de la pelicula en minutos");
		p.setDuracion(leer.nextInt());
		leer.nextLine();
				
		return p;
	}
	
	public Pelicula[] listaPeliulas(){
		Pelicula[] lista=new Pelicula[5];
		
		for (int i =0; i < lista.length;i++) {
			lista[i] = crearPelicula();
		}	
		
		return lista;
	}
}
