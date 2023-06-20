package servicio;

import java.util.Scanner;

import entidad.Persona;

// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje

/**
 * @author yessa
 *
 */
public class ServicioPersona {
	private double imc;
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	public double getImc() {
		return imc;
	}
	
	private Scanner leer = new Scanner(System.in);

	public Persona crearPersona() {

		Persona p = new Persona();

		System.out.println("Ingrese su nombre");
		p.setNombre(leer.nextLine());
		System.out.println("Ingrese su edad");
		p.setEdad(leer.nextInt());
		leer.nextLine();
		System.out.println("Ingrese su sexo siendo M (mujer) H (hombre) O (otro)");
		//toUpperCase para transformar el string recibido a myuscula
		p.setSexo(leer.nextLine().toUpperCase());
		//verificación que el sexo ingresado sea en el formato correcto
		if (p.getSexo().equals("M") || p.getSexo().equals("H") || p.getSexo().equals("O")) {
			System.out.println("Ingrese su peso");
			p.setPeso(leer.nextDouble());
			System.out.println("Ingrese su altura");
			p.setAltura(leer.nextDouble());
			leer.nextLine();
		} else if (!p.getSexo().equals("M") && !p.getSexo().equals("H") && !p.getSexo().equals("O")){
			p.setSexo(null); //iguala a null el sexo porq no es el formato pedido
			System.out.println("El formato no es correcto");
			System.out.println("Ingrese su peso");
			p.setPeso(leer.nextDouble());
			System.out.println("Ingrese su altura");
			p.setAltura(leer.nextDouble());
			leer.nextLine();
		}
		return p;


	}

	// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
	//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
	//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
	//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
	//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
	//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
	//función devuelve un 1.

	public void calcullarIMC(Persona p, Persona a) {
		//verifiando que la altura este en metros
		if (a.getAltura() > 3) {
			a.setAltura(a.getAltura()/100);
			imc = (p.getPeso() / (a.getAltura()*a.getAltura()));
		} else if (a.getAltura() < 3) {
			imc = (p.getPeso() / (a.getAltura()*a.getAltura()));		
		}
		//mensaje de respuesta epara el main
		if (imc < 20) {
			System.out.println("-1"); //indica por debajo del peso ideal
		} else if (imc >= 20 && imc <= 25) {
			System.out.println("0"); //Indica ue esta en el peso ideal
		} else if (imc > 25) {
			System.out.println("1"); //Indica sobrepeso
		}
	}


	// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
	//devuelve un booleano.

	public boolean esMayor(Persona edad) {
		if (edad.getEdad() >= 18) {
			return true;
		} else
			return false;
	}

	}






