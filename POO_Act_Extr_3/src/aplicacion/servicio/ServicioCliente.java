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
 *         registrarCliente: lo registra en el sistema. obtenerClientes():
 *         devuelve una lista con todos los clientes registrados en el sistema.
 *         actualizarCliente(int id, String nombre, int edad, double altura,
 *         double peso, String objetivo): recibe el identificador de un cliente
 *         existente y los nuevos datos del cliente, y actualiza la información
 *         correspondiente en el sistema. eliminarCliente(int id): recibe el
 *         identificador de un cliente existente y lo elimina del sistema.
 */
public class ServicioCliente {

	static Scanner leer = new Scanner(System.in);
	ArrayList<Cliente> clientList = new ArrayList<>();
	int identificador = 0;

	public void menu() {
		int option;
		do {
			System.out.println("Menú Cliente\nSeleccione una opción");
			System.out.println(
					"1. Crear y registrar clientes\n2. Mostrar clientes\n3. Actualizar datos de clientes\n4. Eliminar cliente\n5. Volver al menu principal");
			System.out.print("Opcion: ");
			option = leer.nextInt();
			System.out.println();

			switch (option) {
			case 1 -> registrarCliente();
			case 2 -> obtenerCliente();
			case 3 -> actualizarCliente();
			case 4 -> eliminarCliente();
			case 5 -> System.out.println();
			default -> System.out.println("La opción seleccionada no es válida");
			}
			
		} while (option != 5);

	}

	public ArrayList<Cliente> registrarCliente() {

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

	public void obtenerCliente() {

		if (clientList.isEmpty()) {
			System.out.println("No hay clientes registrados");

		} else {
			for (int i = 0; i < clientList.size(); i++) {
				System.out.print(clientList.get(i) + "\n");
			}
		}
		System.out.println();
	}

	public void actualizarCliente() {

		System.out.println("Indique el ID del cliente");
		int src = leer.nextInt();
		boolean bandera = false;
		for (int i = 0; i < clientList.size(); i++) {

			if (src == clientList.get(i).getId()) {
				bandera = true;
				System.out.println("Que dato desea Actualizar?\n1. Nombre\n2. Altura\n3. Peso\n4. Objetivo");
				int option = leer.nextInt();
				switch (option) {
				case 1:
					System.out.println(clientList.get(i).getNombre() + ", Ingrese el nuevo nombre");
					clientList.get(i).setNombre(leer.nextLine());
					System.out.println("El nombre ha sido actualizado con éxito a " + clientList.get(i).getNombre());
					System.out.println();
					break;
				case 2:
					System.out.println(clientList.get(i).getNombre() + ", Ingrese la nueva altura");
					clientList.get(i).setAltura(leer.nextInt());
					System.out.println("La altura ha sido actualizada con éxito a " + clientList.get(i).getAltura());
					System.out.println();
					break;
				case 3:
					System.out.println(clientList.get(i).getNombre() + ", Ingrese el nuevo peso");
					clientList.get(i).setPeso(leer.nextInt());
					System.out.println("El peso ha sido actualizado con éxito a " + clientList.get(i).getPeso());
					System.out.println();
					break;
				case 4:
					System.out.println(clientList.get(i).getNombre() + ", Ingrese el nuevo objeto");
					clientList.get(i).setObjetivo(leer.nextLine());
					System.out.println("El objetivo ha sido actualizado con éxito a " + clientList.get(i).getObjetivo());
					System.out.println();

				default:
					System.out.println("la opcion seleccionada no es válida");
					break;
				}
				break;
			}
		}

		if (!bandera) {
			System.out.println("El ID no fue encontrado");
			System.out.println();
		}

	}

	/**
	 * 
	 */
	private void eliminarCliente() {
		System.out.println("Indique el ID del cliente");
		int src = leer.nextInt();
		boolean bandera = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (clientList.get(i).getId()== src) {
				bandera = true;
				clientList.remove(i);
				break;
			}
		}
	

	if (!bandera) {
		System.out.println("El ID no fue encontrado");
		System.out.println();
	
	}else if(bandera) {
		System.out.println("La lista de clientes ha sido actualizada");
		obtenerCliente();
	}
}
}