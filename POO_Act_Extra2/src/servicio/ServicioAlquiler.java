package servicio;
import entidad.Alquiler;
import java.time.*;
import java.util.Scanner;
public class ServicioAlquiler {
	static Scanner leer = new Scanner(System.in);
	
public Alquiler crearAlquiler() {
	Alquiler a = new Alquiler();
	System.out.println("Ingrese la pelicula alquilada");
	a.setPeliculaAquilada(leer.nextLine());
	LocalDate hoy = LocalDate.now();
	a.setFechaInicio(hoy);
	System.out.println("Ingrese fecha de devolución");
	String devolucion = leer.nextLine();
	LocalDate fin = LocalDate.parse(devolucion);
	a.setFechaFin(fin);
		
	return a;
}

}
