package principal;
import java.util.Arrays;

//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

public class Arreglos {
	
	public static void main(String[] args) {
		
		double[] arr1 = new double[50];
		double[] arr2 = new double[20];
		
		//asignacion de valores random a cada objeto de la array
		for (int i = 0; i < arr1.length ; i++) {
			arr1[i] = ((double)Math.round(Math.random() * (10000+1))/100); 
		}
		//imprimo la array 1 en pantalla		
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		Arrays.sort(arr1); // <- ordeno de menor a mayor la array 1
		System.out.println(Arrays.toString(arr1)); //<- imprimo por pantalla ordenada
		System.out.println();
		
		//copio todos los 20 valores de la array 1 (para mantener la longitud
		arr2 = Arrays.copyOfRange(arr1, 0, 20);
		//cambio el valor  0.5 de los ultimos 10 valores de la array
		Arrays.fill(arr2, 10, 20, 0.5);
		System.out.println(Arrays.toString(arr2));	//<- imprimo por pantalla la array 2
		
	}
}
