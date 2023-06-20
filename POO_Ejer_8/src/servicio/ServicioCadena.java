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
		
	//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
	//frase ingresada.
	//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
	//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
	//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
	//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
	//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
	//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
	//compone la clase con otra nueva frase ingresada por el usuario.
	//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
	//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
	//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
	//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
	//la frase resultante.
	//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
	//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
	
	public void mostrarVocales(Cadena letra, Cadena largo) {
		int sumar = 0;
		for (int i = 0; i < largo.getLongitud() ; i++) {
			char vocal = letra.getFrase().charAt(i) ;
			
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
}
