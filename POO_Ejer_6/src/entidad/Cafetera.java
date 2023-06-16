package entidad;

import java.util.Scanner;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
// Constructor predeterminado o vacío
// Constructor con la capacidad máxima y la cantidad actual
// Métodos getters y setters.
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada. 

/**
 * @author yessa
 *
 */
public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	static Scanner leer = new Scanner(System.in);
	
	
	//Constructores
	public Cafetera() {
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}
	
	//Getters y Setters
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	//metodos
	public void llenarCafetera() { //llena la cafetera a la cantidad maxima de cafe
		this.cantidadActual = this.capacidadMaxima; 
	}
	
	// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
	//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
	//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
	//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
	//cuanto quedó la taza.
	public void servitTaza() {
		System.out.println("Ingrese la capacidad de la taza vacia");
		int taza = leer.nextInt();
		leer.nextLine();
		
		if (taza > this.cantidadActual) {
			System.out.println("Su taza no se llenó y contiene " + this.cantidadActual + " de café");
			this.cantidadActual = 0;
		} else if (taza <= this.cantidadActual) {
			System.out.println("Su taza se llenó");
			this.cantidadActual -= taza;
		}
	}
	
	// Método vaciarCafetera(): pone la cantidad de café actual en cero.
	public void vaciarCafereta() {
		this.cantidadActual = 0;
	}
	
	// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
	//recibe y se añade a la cafetera la cantidad de café indicada. 
	public void agregarCafe() {
		System.out.println("Ingrese la cantidad de café que desea ingresar a la cafetera");
		int cafe = leer.nextInt();
		leer.nextLine();
		if (this.cantidadActual+cafe > this.capacidadMaxima) {
			System.out.println("Superará el limite máximo de café permitido por la cafetera");
			System.out.println("Ingrese otra cantidad que este entre " + 1 + " y " + (this.capacidadMaxima - this.cantidadActual));
			cafe = leer.nextInt();
			leer.nextLine();
			if (cafe > (this.capacidadMaxima - this.cantidadActual)) {
				System.out.println("Lo sentimos, no podemos realizar su petición");
			}
			
		} else
		this.cantidadActual += cafe; 
	}
	
	//toString
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	

	
}
