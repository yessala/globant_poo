package entidad;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class Cuenta {
	
	//atributos del objeto
	private int numeroCta;
	private String nombre;
	private int dni;
	private int saldoActual;
	
	private Scanner leer = new Scanner(System.in);
	//Constructores
	public Cuenta() {
		
	}

	public Cuenta(int numeroCta, String nombre, int dni, int saldoActual) {
		this.numeroCta = numeroCta;
		this.nombre = nombre;
		this.dni = dni;
		this.saldoActual = saldoActual;
	}

	//getters y setters
	public int getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(int numeroCta) {
		this.numeroCta = numeroCta;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	
	// metods y funciones
	public void ingresar(double ingreso) {
		
		 this.saldoActual += ingreso;
		
	}
	
	public void retirar(double retiro) {
		
		if (retiro > this.saldoActual ) {
			this.saldoActual = 0;
		}else if (this.saldoActual > retiro){
		this.saldoActual -= retiro;
		}
	}

	public void extraccionRapida() {
		System.out.println("Que cantidad desea retirar");
		double retiro = leer.nextDouble();
		if (retiro > (this.saldoActual*0.20)) {
			System.out.println("la cantidad que desea retirar es superior a la que permite el método");
			
		}else if (retiro <= (this.saldoActual*0.20)) {
			this.saldoActual -= retiro;
		}
	}

	

	public void consultarSaldo() {
		
		System.out.println("Su saldo Actual es " + this.saldoActual);
		
	}
	
	public void consultarDatos() {
		
		System.out.println("Su numero de cuenta es");
		System.out.println(this.numeroCta);
		System.out.println("Su Nombre registrado es");
		System.out.println(this.nombre);
		System.out.println("Su DNI");
		System.out.println(this.dni);
	}

	//toString
	@Override
	public String toString() {
		return "Cuenta [numeroCta=" + numeroCta + ", nombre=" + nombre + ", dni=" + dni + ", saldoActual=" + saldoActual
				+ "]";
	}

	
}
