/**
 * 
 */
package aplicacion.servicio;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacion.entidad.Cliente;

/**
 * @author yessa
 * 
 * registrarCliente: lo registra en el sistema.
 * obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
 * actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): 
 * recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la 
 * información correspondiente en el sistema.
 * eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
 */
public class ServicioCliente {
	
	 Scanner leer = new Scanner(System.in).useDelimiter("\n");
	 ArrayList<Cliente> clientList= new ArrayList<>();
	int identificador = 0; 
	
	
	public void menu() {
		
		System.out.println("Seleccione una opción");
		System.out.println("1. Crear y registrar clientes\n2. Mostrar clientes\n3. Actualizar datos de clientes\n4. Eliminar cliente\5. Salir");
		System.out.print("Opcion: ");
		int option = leer.nextInt();
		
		switch (option) {
		case 1 -> registrarCliente();
		case 2 -> obtenerCliente();
		case 3 -> actualizarCliente();
		
		
		
		
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}
	
	public  ArrayList<Cliente> registrarCliente(){
		Cliente c1 = new Cliente(++identificador, "Carlos", 1.70, 95, "Aumentar masa muscular");
		Cliente c2 = new Cliente(++identificador, "Rebeca", 1.60, 72, "Bajar de peso");
		Cliente c3 = new Cliente(++identificador, "Marcos", 1.72, 80, "Tonificar");
		Cliente c4 = new Cliente(++identificador, "Pamela", 1.62, 60, "Aumentar peso");
		Cliente c5 = new Cliente(++identificador, "Manuel", 1.68, 100, "Bajar de peso");
		
		clientList.add(c1);		
		clientList.add(c2);		
		clientList.add(c3);		
		clientList.add(c4);		
		clientList.add(c5);		
		
		return clientList;
	}
	
	public  void obtenerCliente() {
		
		if(clientList.isEmpty()) {
			System.out.println("No hay clientes registrados");
			
		}else {
			for (int i = 0; i < clientList.size(); i++) {
				System.out.print(clientList.get(i)+"\n");
			}
		}
		
	}
	
	public void actualizarCliente() {
		
		System.out.println("Indique el ID del cliente");
		
		
		
	}
	
	
}
