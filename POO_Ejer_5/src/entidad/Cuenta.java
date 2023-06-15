package entidad;

import java.util.Scanner;

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes


/**
 * @author yessa
 *
 */
public class Cuenta {
	
	//atributos del objeto
	private int numeroCta;
	private int dni;
	private int saldoActual;
	
	private Scanner leer = new Scanner(System.in);
	//Constructores
	public Cuenta() {
		
	}

	public Cuenta(int numeroCta, int dni, int saldoActual) {
		this.numeroCta = numeroCta;
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

	public long getDni() {
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
	
	//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
	//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
	
	public 
	
	//toString
	@Override
	public String toString() {
		return "Cuenta [numeroCta=" + numeroCta + ", dni=" + dni + ", saldoActual=" + saldoActual + "]";
	}
	
	
}
