package servicio;

import java.util.Scanner;

import entidad.Persona;

// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
/**
 * @author yessa
 *
 */
public class ServicioPersona {

	private Scanner leer = new Scanner(System.in);
	
	public Persona crearPersona() {
		
		Persona p = new Persona();
//		private String nombre;
//		private int edad;
//		//sexo like a char M (mujer), H (homre), O (otro)
//		private String sexo;
//		private double peso;
//		private double altura;
		System.out.println("Ingrese su nombre");
		p.setNombre(leer.nextLine());
		System.out.println("Ingrese su edad");
		p.setEdad(leer.nextInt());
		leer.nextLine();
		System.out.println("Ingrese su sexo siendo M (mujer) H (hombre) O (otro)");
		p.setSexo(leer.nextLine());
		System.out.println("Ingrese su peso");
		p.setPeso(leer.nextDouble());
		System.out.println("Ingrese su altura");
		p.setAltura(leer.nextDouble());
		
		return p;
	}









}

