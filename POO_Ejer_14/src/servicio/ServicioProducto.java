package servicio;
 import java.util.Scanner;

import entidad.Mobile;
// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.

public class ServicioProducto {
	static Scanner leer = new Scanner(System.in);
public Mobile crearMobile() {
	Mobile ph = new Mobile();
//	private String marca;
//	private double precio;
//	private String modelo;
//	private String memoriaRam;
//	private String almacenamiento;
	System.out.println("Ingrese la Marca del equipo.");
	ph.setMarca(leer.nextLine());
	System.out.println("Ingrese el precio del equipo.");
	ph.setPrecio(leer.nextDouble());
	leer.nextLine();
	System.out.println("Ingrese el modelo del equipo.");
	ph.setModelo(leer.nextLine());
	System.out.println("Ingrese cantidad de Memoria RAM del equipo.");
	ph.setMemoriaRam(leer.nextLine());
	System.out.println("Ingrese la capacidad de almacenamiento interno del equipo.");
	ph.setAlmacenamiento(leer.nextLine());
	ph.setCodigo(ingresarCodigo(ph));
	leer.nextLine();
	
	
	return ph;
}

// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
public int[] ingresarCodigo(Mobile ph) {
	int[] code = new int[ph.getCodigo().length];
	for (int i = 0; i < ph.getCodigo().length; i++) {
	System.out.println("Digite el numero " + (i+1) + " del código.");
	code[i] = leer.nextInt();
	}
	return code;

}

}
