package principal;

import entidad.Cadena;
import servicio.ServicioCadena;

public class Frase {

	
	
	public static void main(String[] args) {
		
		ServicioCadena sf = new ServicioCadena();
		Cadena f = sf.crearCadena();
		
		System.out.println(f);
		System.out.println();
		sf.mostrarVocales(f, f);
		

	}
	
	

}
