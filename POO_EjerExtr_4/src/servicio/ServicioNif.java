/**
 * 
 */
package servicio;

import java.util.Scanner;

import entidad.Nif;

/**
 * @author yessa
 *
 */
public class ServicioNif {
	
	static Scanner leer = new Scanner(System.in);
//	 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//	corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//	resultado del calculo.
	public Nif crearNif() {
		
		Nif n = new Nif();
		System.out.println("Ingrese su DNI");
		n.setDni(leer.nextInt());
		n.setLetra(calcular(n));
		
		return n;
		
	}
//	 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//	en mayúscula; por ejemplo: 00395469-F).
	public char calcular(Nif doc) {
		
		int num = doc.getDni()%22;
		
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

		return letra[num];
	}
	
//	 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//	en mayúscula; por ejemplo: 00395469-F).
	
	public void mostrar(Nif doc) {
		System.out.println("\nEl nif es: \n" + doc.getDni()+"-"+doc.getLetra());
	}
	
//	La letra correspondiente al dígito verificador se calculará a traves de un método que
//	funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//	número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//	buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//	división para obtener la letra correspondiente.

}
