package servicio;

import java.util.Scanner;
import entidad.Cadena;

public class ServicioCadena {
	
	static Scanner leer = new Scanner(System.in);
	
	public Cadena crearCadena() {
		
		Cadena f = new Cadena();
		
		System.out.println("Ingrese una frase");
		f.setFrase(leer.nextLine());		
		f.setLongitud(f.getFrase().length());
		
		return f;
		
		}
		
	//método que muestra cuantas vocales hay en la frase
	public void mostrarVocales(Cadena frase) {
		int sumar = 0;
		for (int i = 0; i < frase.getLongitud() ; i++) {
			char vocal = frase.getFrase().toLowerCase().charAt(i) ;
			
			switch (vocal) {
			case 'a':
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u':
				sumar += 1;
				break;
			default:
				break;
			}
		}
		System.out.println("En la frase hay " + sumar + " vocales");
	}

	//método que cuenta cada vocal y las muestra por pantalla
	public void vecesRepetido(Cadena frase) {
		
		System.out.println("Ingrese un Caracter que quiera identificar en la frase");
		String caracter = leer.nextLine();
		
		int sumar = 0;
		
		for (int i = 0; i < frase.getLongitud() ; i++) {
			String letter = frase.getFrase().substring(i,i+1) ;
			
			if (letter.equalsIgnoreCase(caracter)) {
				sumar += 1;
			}
		}
		System.out.println("En la frase " + frase.getFrase() +" el caracter '" + caracter+"' se repite " + sumar + " veces.") ;
	}

	//metodo para invertir la frase
	public void invertirFrase(Cadena frase) {
		String nuevaFrase = "";
		//el bucle recorre la frase desde el final al principio y va guardando cada letra en una variable
		for (int i = frase.getLongitud()-1; i >= 0; i--) {
			String letter = frase.getFrase().substring(i,i+1);
			nuevaFrase = nuevaFrase.concat(letter);
		}
		System.out.println(nuevaFrase);
	}

	//método para comparar longitudes de dos frases
	public void compararLongitud(Cadena frase) {
		
		System.out.println("Ingrese una nueva frase para comparar");
		String nuevaFrase = leer.nextLine();
		int fraseVieja = frase.getLongitud();
		int fraseNueva = nuevaFrase.length();
		
		if (fraseVieja == fraseNueva) {
			System.out.println("Las frases tiene en mismo largo");
		}else
			System.out.println("Las frases no coinciden en longitud");
				
	}

	//método para unir frases
	public void unirFrases(Cadena frase) {
		System.out.println("Ingrese la nueva frase");
		String nuevaFrase = leer.nextLine();
		
		String fraseUnida = frase.getFrase().concat(nuevaFrase);
		
		System.out.println("La combinación de ambas frases es");
		System.out.println(fraseUnida);
	}
	
	//método para reemplazar las letras a por otro caracter
	public void reemplazar(Cadena frase) {
		System.out.println("Ingrese el caracter por el cual desea reemplazar la letra a");
		String caracter = leer.nextLine();
		int largo = frase.getLongitud();
		String fraseNueva = "";
		for (int i = 0; i < largo ; i++) { 
		String letra = frase.getFrase().toLowerCase().substring(i,i+1);
		switch (letra) {
		case "a":
			fraseNueva = fraseNueva.concat(caracter);
			break;
		default:
			fraseNueva = fraseNueva.concat(letra);
			break;
		}
		}
		System.out.println(fraseNueva);
	}

	//Este metodo validará la existencia de un caracter elegido dentro de la frase
	public boolean contiene(Cadena frase) {
		boolean contener = false;
		System.out.println("Ingrese el caracter que desea validar dentro de la frase");
		String caracter = leer.next();
		System.out.println();
		
		for (int i = 0; i < frase.getLongitud() ; i++) {
			String letter = frase.getFrase().substring(i,i+1) ;
			
			if (letter.equalsIgnoreCase(caracter)) {
				contener = true;
				break;
			}
		}		
		
		System.out.println("La frase tiene el caracter " + caracter);
		return contener;
	}
}


