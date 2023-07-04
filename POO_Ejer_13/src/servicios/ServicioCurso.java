package servicios;
import java.util.Scanner;

import entidad.Curso;
public class ServicioCurso {
	
	static Scanner leer = new Scanner(System.in);	
//	 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//	usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//	Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//	al atributo alumnos
	public Curso crearCurso(){
		Curso c = new Curso();

		System.out.println("Ingrese el nombre del curso");
		c.setNombreCurso(leer.nextLine());
		System.out.println("Ingrese la cantidad de horas por dia de dicho curso");
		c.setCantidadHorasPorDia(leer.nextDouble());
		System.out.println("Ingrese la cantidad de días a la semana de dicho curso");
		c.setCantidadDiasPorSemana(leer.nextInt());
		System.out.println("Ingrese el precio por hora del curso");
		c.setPrecioPorHora(leer.nextDouble());
		leer.nextLine();
		do {
		System.out.println("Ingrese el turno del curso Mañana o Tarde");
		c.setTurno(leer.nextLine());
		}while(!c.getTurno().equalsIgnoreCase("Mañana") && !c.getTurno().equalsIgnoreCase("Tarde"));
		c.setAlumnos(cargarAlumnos(c));
		return c;
	}
//	método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//	que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//	en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//	nombre de cada alumno.
public String[] cargarAlumnos(Curso c) {
	
	String[] arr = new String[c.getAlumnos().length];
		for (int i=0; i < arr.length;i++) {
			System.out.println("Ingrese nombre del alumno");
			arr[i]= leer.nextLine();
			}		
	return arr;
}
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
public double gananciaSemanal(Curso c) {
	
	double ganancia = (c.getCantidadHorasPorDia()*c.getPrecioPorHora())*c.getCantidadDiasPorSemana()*c.getAlumnos().length;
	
	return ganancia;
}
}


