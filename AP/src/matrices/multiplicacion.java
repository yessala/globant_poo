package matrices;
//la matriz resultante de la multiplicacion tendra 
//la fila de la primera matriz y las columnas de la 2da

import java.util.Arrays;
import java.util.Scanner;


public class multiplicacion {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int i,j;
		System.out.println("Ingrese la cantidad de filas para la primera matriz");
		int row1 = leer.nextInt();
		System.out.println("Ingrese la cantidad de columnas para la primera matriz");
		int column1 = leer.nextInt();

		System.out.println("Ingrese la cantidad de filas para la segunda matriz");
		int row2 = leer.nextInt();
		System.out.println("Ingrese la cantidad de columnas para la segunda matriz");
		int column2 = leer.nextInt();		

		int[][] matriz = new int[row1][column1];
		int[][] matriz2 = new int[row2][column2];

		if(column1!=row2){
			System.out.println("La multipliació de las matrices no puede "
					+ "realizarce porque no hay compatibilidad");
		}else {
			//rellenando matriz 1 teniendo en cuenta las filas y columnas ingresadas con el usuario
			for ( i=0;i < row1; i++ ) {
				for ( j=0; j < column1; j++){
					matriz[i][j] = (int) (Math.random()*10);					
				}
			}
			//rellenando matriz 2 teniendo en cuenta las filas y las columnas ingresadas por el usuario
			for ( i=0;i < row2; i++ ) {
				for ( j=0; j < column2; j++){
					matriz2[i][j] = (int) (Math.random()*10);					
				}
			}

			//			System.out.println(Arrays.deepToString(matriz));
			//			System.out.println();
			//			System.out.println(Arrays.deepToString(matriz2));			


			//vamos a la multiplicacion
			//La matriz resultante tiene las filas de la primera matriz y las columnas de la segunda
			int[][] matriz3= new int[row1][column2];
			int suma= 0;
			int x,y,z;
			//x llega hasta el valor de las filas de la primera matriz
			for (x = 0; x < row1;x++) {
				//y llega hasta el valor de las columnas de la 2da matriz
				for (y = 0; y < column2; y++) {
					//z llega hasta el valor de la compatibilidad de las matrices 
					//(columnas de la primera y filas de la segunda)
					for(z = 0; z < row2; z++){
						//esta formula suma lamultiplicacion de los valores
						suma+= matriz[x][z]*matriz2[z][y];
					}
					//aqui asignamos los valores resultantes de la formula de suma a los
					//elementos de la matriz 3
					matriz3[x][y]= suma;
					//Igualamos a 0 el valor de suma para volver a realizar la operacion
					//en la proxima iteración de y
					suma = 0;
				}
			}
			//Vamos a imprimir las 3 matrices
			System.out.println("Primera Matriz");
			for ( i=0;i < row1; i++ ) {
				for ( j=0; j < column1; j++){
					System.out.print("["+matriz[i][j]+"]");
				}
				System.out.println();

			}
			System.out.println();
			System.out.println("Segunda Matriz");
			for ( i=0;i < row2; i++ ) {
				for ( j=0; j < column2; j++){
					System.out.print("["+matriz2[i][j]+"]");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Matriz resultante");
			for ( i=0;i < matriz3[0].length; i++ ) {
				for ( j=0; j < matriz3.length; j++){
					System.out.print("["+matriz3[i][j]+"]");
				}
				System.out.println();
			}		

		}

		//		int[][] arr = new int[3][3];
		//		int[][] arr2 = new int[3][3];
		//		
		//		for(int i = 0; i < arr[0].length;i++) {
		//			for (int j = 0; j < arr[0].length; j++) {
		//				arr[i][j]=  (int) Math.round(Math.random()*10);
		//				arr2[i][j]= (int) Math.round(Math.random()*10);
		//
		//			}
		//		}
		//
		//		for(int i = 0; i < arr[0].length;i++) {
		//			for (int j = 0; j < arr[0].length; j++) {
		//				System.out.print(arr[i][j]+" ");	
		//			}
		//			System.out.println();
		//
		//		}
		//		System.out.println();
		//		for(int i = 0; i < arr[0].length;i++) {
		//			for (int j = 0; j < arr[0].length; j++) {
		//				System.out.print(arr2[i][j] + " ");	
		//			}
		//			System.out.println();
		//		}
		//		int[][] arr3 = new int[3][3];
		//		int suma = 0;
		//		int x,y,z;
		//		for ( x = 0; x < 3; x++ ) {
		//			//x vale la cantidad de filas la matriz 1
		//			for (y=0; y < 3; y++) {
		//				//y vale la cantidad de columnas de la matriz 2
		//				for (z = 0; z < 3;z++) {
		//					//z representa la cantidad de columnas de la matriz 1 y las filas de
		//					//la matriz 2 (deben ser las mismas para que se pueda multiplicar)
		//					suma += arr[x][z] * arr2[z][y];
		//				}
		//				arr3[x][y]= suma;
		//				suma = 0;
		//			}
		//
		//		}
		//		System.out.println();
		//		for(int i = 0; i < arr3[0].length;i++) {
		//			for (int j = 0; j < arr3[0].length; j++) {
		//				System.out.print(arr3[i][j] + " ");
		//			}
		//			System.out.println();
		//		}

	}
}
