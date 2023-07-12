/**
 * 
 */
package aplicacion.servicio;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacion.entidad.Rutina;

/**
 * @author yessa
 * 
 *         crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo
 *         agrega al sistema. obtenerRutinas(): devuelve una lista con todas las
 *         rutinas registradas en el sistema. actualizarRutina(int id, String
 *         nombre, int duracion, String nivelDificultad, String descripcion):
 *         recibe el identificador de una rutina existente y los nuevos datos de
 *         la rutina, y actualiza la información correspondiente en el sistema.
 *         eliminarRutina(int id): recibe el identificador de una rutina
 *         existente y la elimina del sistema.
 */
public class ServicioRutina {
	static Scanner leer = new Scanner(System.in);
	ArrayList<Rutina> rutineList = new ArrayList<>();
	int identificador = 0;

	public void menu() {
		int option;
		do {
			System.out.println("Menú Rutina\nSeleccione una opción");
			System.out.println(
					"1. Crear y registrar rutinas\n2. Mostrar rutinas\n3. Actualizar rutina\n4. Eliminar rutina\n5. Volver al menu principal");
			System.out.print("Opcion: ");
			option = leer.nextInt();
			System.out.println();

			switch (option) {
			case 1 -> registrarRutina();
			case 2 -> obtenerRutina();
			case 3 -> actualizarRutina();
			case 4 -> eliminarRutina();
			case 5 -> System.out.println();
			default -> System.out.println("La opción seleccionada no es válida");
			}

		} while (option != 5);

	}

	public ArrayList<Rutina> registrarRutina() {

		Rutina r1 = new Rutina(++identificador, "Tonificar", 60, "Hardcore", "");
		Rutina r2 = new Rutina(++identificador, "Bajar Peso", 60, "Intermedio", "");
		Rutina r3 = new Rutina(++identificador, "Aumentar Peso", 45, "Basico", "");
		Rutina r4 = new Rutina(++identificador, "Aumentar masa Muscular", 95, "Hardcore", "");
		Rutina r5 = new Rutina(++identificador, "Piernas", 90, "Intermedio", "Peso y repetición");

		rutineList.add(r1);
		rutineList.add(r2);
		rutineList.add(r3);
		rutineList.add(r4);
		rutineList.add(r5);

		return rutineList;
	}

	public void obtenerRutina() {

		if (rutineList.isEmpty()) {
			System.out.println("No hay rutinas registrados");

		} else {
			for (int i = 0; i < rutineList.size(); i++) {
				System.out.print(rutineList.get(i) + "\n");
			}
		}
		System.out.println();
	}

	public void actualizarRutina() {

		System.out.println("Indique el ID de la rutiina");
		int src = leer.nextInt();
		boolean bandera = false;
		for (int i = 0; i < rutineList.size(); i++) {

			if (src == rutineList.get(i).getId()) {
				bandera = true;
				System.out.println("Que dato desea Actualizar?\n1. Nombre\n2. Altura\n3. Peso\n4. Objetivo");
				int option = leer.nextInt();
				switch (option) {
				case 1:
					System.out.println("Ingrese el nuevo nombre");
					rutineList.get(i).setNombre(leer.nextLine());
					System.out.println("El nombre ha sido actualizado con éxito a " + rutineList.get(i).getNombre());
					System.out.println();
					break;
				case 2:
					System.out.println("Ingrese la nueva duración");
					rutineList.get(i).setDuracion(leer.nextInt());
					System.out
					.println("La duración ha sido actualizada con éxito a " 
					+ rutineList.get(i).getDuracion());
					System.out.println();
					break;
				case 3:
					System.out.println("Ingrese el nuevo nivel de dificultad");
					rutineList.get(i).setNivelDificultad(leer.nextLine());
					System.out.println("El nivel de dificultad ha sido actualizado con éxito a "
							+ rutineList.get(i).getNivelDificultad());
					System.out.println();
					break;
				case 4:
					System.out.println("Ingrese la nuevo descripción");
					rutineList.get(i).setDescripcion(leer.nextLine());
					System.out.println(
							"La descripción ha sido actualizado con éxito a " + rutineList.get(i).getDescripcion());
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
	private void eliminarRutina() {
		System.out.println("Indique el ID de la rutina");
		int src = leer.nextInt();
		boolean bandera = false;
		for (int i = 0; i < rutineList.size(); i++) {
			if (rutineList.get(i).getId() == src) {
				bandera = true;
				rutineList.remove(i);
				break;
			}
		}
		if (!bandera) {
			System.out.println("El ID no fue encontrado");
			System.out.println();
		} else if (bandera) {
			System.out.println("La lista de rutinas ha sido actualizada");
			obtenerRutina();
		}
	}
}
