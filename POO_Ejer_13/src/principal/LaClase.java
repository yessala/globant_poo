package principal;
import entidad.Curso;
import servicios.ServicioCurso;

public class LaClase {

	public static void main(String[] args) {
		ServicioCurso cs = new ServicioCurso();
		Curso c = cs.crearCurso();
		
		System.out.println(c);
		System.out.println("La ganancia por semana es $" + cs.gananciaSemanal(c));
		
	}

}
