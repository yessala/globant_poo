package servicios;

import java.util.Scanner;

import entidad.Operacion;

/**
 * @author yessa
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro. :)
b) Metodo constructor sin los atributos pasados por parámetro. :)
c) Métodos get y set. :)
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto. :)
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. :)
f) Método restar(): calcular la resta de los números y devolver el resultado al main :)
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main :)
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. 

 */
public class ServiciosOperaciones {
	private Scanner leer = new Scanner(System.in);
	
	public Operacion crearOperacion() {
		Operacion op = new Operacion();
		
		System.out.println("Ingrese el primer número");
		op.setNum1(leer.nextInt());
		System.out.println("Ingrese el segundo número");
		op.setNum2(leer.nextInt());
		
		return op;
	}
	
	public void sumar(Operacion n1, Operacion n2) {
		
		System.out.println("La suma de " + n1.getNum1() + " y " + n2.getNum2() + " es " + (n1.getNum1()+n2.getNum2()) + ".");
	}
	
	public void restar(Operacion n1, Operacion n2) {
		
		System.out.println("La resta de " + n1.getNum1() + " menos " + n2.getNum2() + " es " + (n1.getNum1()-n2.getNum2()) + ".");
	
	}
	
	public void multiplicar(Operacion n1, Operacion n2) {
		if (n1.getNum1() == 0 || n2.getNum2() == 0) {
			System.out.println("El resultado es 0 debido a la propiedad cero de la multiplicación.");
		} else
		System.out.println("La producto de " + n1.getNum1() + " por " + n2.getNum2() + " es " + (n1.getNum1()*n2.getNum2()));
	}
	
	public void dividir(Operacion n1, Operacion n2) {
		if (n1.getNum1()==0 || n2.getNum2() == 0) {
			System.out.println("El resultado es 0, no se puede dividir por cero.");
		} else 
		System.out.println("La división de " + n1.getNum1() + " por " + n2.getNum2() + " es " + (n1.getNum1()/n2.getNum2()) + ".");
	}
	
}
