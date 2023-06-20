package principal;

import entidad.Cadena;
import servicio.ServicioCadena;

public class Frase {

	
	
	public static void main(String[] args) {
		
		ServicioCadena sf = new ServicioCadena();
		Cadena f = sf.crearCadena();
		System.out.println();
		System.out.println(f);
		System.out.println();
		sf.mostrarVocales(f);
		System.out.println();
		sf.vecesRepetido(f);
		System.out.println();
		sf.invertirFrase(f);
		System.out.println();
		sf.compararLongitud(f);
		System.out.println();
		sf.unirFrases(f);
		System.out.println();
		sf.reemplazar(f);
		System.out.println();
		System.out.println(sf.contiene(f));
	}
	
	

}
