package servicio;
import java.util.Scanner;

import entidad.Matematica;

/**
 * @author yessa
 *
 */
public class ServicioMatematica {
	static Scanner leer = new Scanner(System.in);
	
	public Matematica crearMatematica() {
		
		Matematica m = new Matematica();
		//redondeo para que no tenga decimales, coloco numero random (redondeado) que me arroje hasta 10 y corro la coma dos puntos 
		//a la izquierda diviendo entre 100 y me queda formato 10,00
		m.setNum1((double)Math.round(Math.random() * (1000+1))/100);
		m.setNum2((double)Math.round(Math.random() * (1000+1))/100);
		
		return m;
	}
	
	//usando el Math.max se devuelve el numero mayor de ambos numeros
	public void devolverMayor(Matematica num) {
		System.out.println("El número mayor de ambos valores es "+Math.max(num.getNum1(),num.getNum2()));
	}
	
	//el siguiente metodo se redondea el numero y se calcula la potecia del mayor por el menor con Math.pow
	//sacanto el mayor con Math.max y el menor con Math.min
	public void calcularPotencia(Matematica num) {
		int numero1 = (int) Math.round(num.getNum1());	
		int numero2 = (int) Math.round(num.getNum2());	
		System.out.println("La potencia es " + Math.pow(Math.max(numero1, numero2), Math.min(numero1, numero2)));
	
	}
	
	//metodo que calcula la raiz cuadrada del numero menor de los dos valores
	public void calculaRaiz(Matematica num) {
		//asigno a la variabl numero el valor absoluto del numero menor
		double numero = Math.abs(Math.min(num.getNum1(),num.getNum2()));
		//imprimo la raiz cuadrada de dicho numero
		System.out.println("La raiz cuadrada de " + numero + " es " + String.format("%.2f", Math.sqrt(numero)));
		
	}

}
