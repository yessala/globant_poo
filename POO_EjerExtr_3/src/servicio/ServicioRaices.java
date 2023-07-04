package servicio;

import java.util.Scanner;

import entidad.Raices;

/**
 * @author yessa
 *
 */
public class ServicioRaices {

	static Scanner leer = new Scanner(System.in);

	public Raices crearRaices() {

		Raices r = new Raices();

		System.out.println("Ingrese valores de los tres coeficientes: ");
		System.out.print("a: ");
		r.setA(leer.nextInt());
		System.out.print("b: ");
		r.setB(leer.nextInt());
		System.out.print("c: ");
		r.setC(leer.nextInt());

		return r;
	}

//	 Método getDiscriminante(): devuelve el valor del discriminante (double). El
//	 discriminante tiene la siguiente formula: (b^2)-4*a*c

	public double getDriscriminante(Raices value) {

		double discriminante = (Math.pow(value.getB(), 2) - 4 * value.getA() * value.getC());
		return discriminante;
	}

//	  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//	 que esto ocurra, el discriminante debe ser mayor o igual que 0.

	public boolean tieneRaices(Raices value) {
		boolean result;
		
		if (getDriscriminante(value)>0) {
			result = true;
		}else		
		result = false;
		
		return result;
	}
	
	
//  Método tieneRaiz(): devuelve un booleano indicando si tiene una única
// solución, para  que esto ocurra, el discriminante debe ser igual que 0.
	
	public boolean tieneRaiz(Raices value) {
		boolean result;
		
		if (getDriscriminante(value)==0) {
			result = true;
		}else		
		result = false;
		
		return result;
	}
	
//	  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//	 posibles soluciones.
	
	public void obtenerRaices(Raices value) {
		
		if (tieneRaices(value)==true) {
			double result1 = ((-1*(value.getB())+(Math.sqrt(Math.pow(value.getB(), 2) - 4 * value.getA() * value.getC())))/2*value.getA());
			double result2 = ((-1*(value.getB())-(Math.sqrt(Math.pow(value.getB(), 2) - 4 * value.getA() * value.getC())))/2*value.getA());

			System.out.println("Las soluciones son: " + String.format("%.2f",result1) + " y " + String.format("%.2f",result2));
			}	else {
				System.out.println("");
			}
	}
//	  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//	 Es en el caso en que se tenga una única solución posible.
	
	public void obtenerRaiz(Raices value) {
		
		if (tieneRaiz(value)==true) {
			double result1 = ((-1*(value.getB())+(Math.sqrt(Math.pow(value.getB(), 2) - 4 * value.getA() * value.getC())))/2*value.getA());

			System.out.println("La solución es : " + String.format("%.2f",result1));
		}
			//System.out.println("La ecuación " + value.getA()+"x^2+"+value.getB()+"x"+value.getC()+"=0 no tiene );
	}
//	  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//	 pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//	 obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//	 de no existir solución, se mostrará un mensaje.
	
	public void calcular(Raices value) {
		
		if (tieneRaices(value)==true) {
			obtenerRaices(value);
		}else if (tieneRaiz(value)== true) {
			obtenerRaiz(value);
		}else if (tieneRaices(value)==false && tieneRaiz(value)==false){
			System.out.println("La ecuación no tiene solución en números reales");
		}
	}
 
	
}
