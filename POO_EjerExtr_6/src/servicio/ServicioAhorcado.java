/**
 * 
 */
package servicio;

import java.util.Arrays;
import java.util.Scanner;

import entidad.Ahorcado;

/**
 * @author yessa
 *
 */
public class ServicioAhorcado {

	static Scanner leer = new Scanner(System.in);

	public Ahorcado crearJuego() {

		Ahorcado datos = new Ahorcado();

		System.out.println("Ingrese la palabra con la que desea jugar");

		datos.setWord(convertir());
		System.out.println("Ingrese el máximo de intentos para esta palabra");
		datos.setIntentos(leer.nextInt());
		leer.nextLine();

		return datos;
	}

	public void lontigud(Ahorcado dato) {
		System.out.println("La longitud de la palabra es de " + dato.getWord().length + " letras.");
	}

	public String[] convertir() {
		String palabra = leer.nextLine();
		System.out.println();
		String[] letras = new String[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {

			letras[i] = palabra.substring(i, i + 1);
		}
		return letras;
	}

	public boolean buscar(Ahorcado dato) {
		boolean find = false;
		System.out.println("Ingrese la letra a buscar");
		dato.setLetra(leer.nextLine());
		System.out.println();
		lontigud(dato);
		System.out.println();
		for (int i = 0; i < dato.getWord().length; i++) {
			if (dato.getWord()[i].equals(dato.getLetra())) {
				find = true;
				break;
			}
		}
		return find;
	}

	public void encontradas(Ahorcado dato) {
//		String[] mostrar = new String[dato.getWord().length];
//		for (int i = 0; i < dato.getWord().length; i++) {
//			mostrar[i] = "_ ";
//		}
		int encontrada = 0;
		boolean letra = buscar(dato);
		if (letra == false) {
			System.out.println("La letra no se encuentra en la palabra");

			dato.setIntentos(dato.getIntentos() - 1);
		} else if (letra == true) {
			for (int i = 0; i < dato.getWord().length; i++) {
				if (dato.getWord()[i].equals(dato.getLetra())) {
					encontrada++;
//					mostrar[i] = (dato.getLetra()+" ");
				}				
			}			
			System.out.println();
			System.out.println("La letra se encuentra en la palabra");
			dato.setIntentos(dato.getIntentos() - 1);
		}
//		System.out.println();
//		for (int i = 0; i < mostrar.length; i++) {
//			System.out.print(mostrar[i]);
//		}
		System.out.println();
		dato.setEncontradas(dato.getEncontradas() + encontrada);
		System.out.println();
		System.out.println("Numero de letras(entontradas/restantes): (" + dato.getEncontradas() + "/"
				+ (dato.getWord().length - dato.getEncontradas()) + ").");
	}

	public void intentos(Ahorcado dato) {
		System.out.println("Le quedan " + dato.getIntentos() + " intentos.");
	}

	public void terminar(Ahorcado dato) {

		if (dato.getEncontradas() == dato.getWord().length) {
			System.out.println();
			System.out.println("Enhorabuena has Ganado!");
		} else if (dato.getIntentos() == 0) {
			System.out.println();
			System.out.println("agotaste tus intentos, quieres intentar descubrir la palabra? s/n: ");
			String respuesta = leer.nextLine();
			if (respuesta.equalsIgnoreCase("n")) {
				System.out.println();
				System.out.println("Hasta luego");
			} else if (respuesta.equalsIgnoreCase("s")) {
				System.out.println();
			System.out.println("Ingrese la palabra");
			boolean esIgual = Arrays.equals(dato.getWord(), convertir());
			if (esIgual == false) {
				System.out.println();
				System.out.println("Has perdido");
			} else if (esIgual == true) {
				System.out.println();
				System.out.println("Enhorabuena has Ganado!");
			}
		}
	}
	}

	public void juego(Ahorcado dato) {

		do {
			System.out.println();
			encontradas(dato);
			System.out.println();
			intentos(dato);
			System.out.println();
			System.out.println("________________________");

		} while (dato.getEncontradas() < dato.getWord().length && dato.getIntentos() > 0);

		terminar(dato);
	}
}
