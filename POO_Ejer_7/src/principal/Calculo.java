package principal;

import entidad.Persona;
import servicio.ServicioPersona;

/**
 * @author yessa
 *
 */
public class Calculo {

	public static void main(String[] args) {
		
		ServicioPersona sp = new ServicioPersona();
		
		Persona p1 = sp.crearPersona();
		System.out.println();
		Persona p2 = sp.crearPersona();
		System.out.println();
//		Persona p3 = sp.crearPersona();
//		System.out.println();
//		Persona p4 = sp.crearPersona();
//		System.out.println();
		//A continuación, en la clase main hacer lo siguiente:
		//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
		//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
		//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
		//persona es mayor de edad.
		//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
		//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
		//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
		//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 		
		
		System.out.println("Datos de " + p1.getNombre());
		sp.calcullarIMC(p1, p1);
		System.out.println(p1 + " " + sp.getImc());
		System.out.println("El imc calculado es de " + String.format("%.2f",sp.getImc()));
		System.out.println();
		System.out.println("Datos de " + p2.getNombre());
		sp.calcullarIMC(p2, p2);
		System.out.println(p2 + " " + sp.getImc());
		System.out.println("El imc calculado es de " + String.format("%.2f",sp.getImc()));
		
	}

}
