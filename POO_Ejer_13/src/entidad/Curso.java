package entidad;

import java.util.Arrays;

//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo
/**
 * @author yessa
 *
 */
public class Curso {
private String nombreCurso;
private double cantidadHorasPorDia;
private int cantidadDiasPorSemana;
private double precioPorHora;
private String turno;
private String[] alumnos=new String[5];

public Curso() {
}

public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, double precioPorHora,
		String turno, String[] alumnos) {
	this.nombreCurso = nombreCurso;
	this.cantidadHorasPorDia = cantidadHorasPorDia;
	this.cantidadDiasPorSemana = cantidadDiasPorSemana;
	this.precioPorHora = precioPorHora;
	this.turno = turno;
	this.alumnos = alumnos;
}

public String getNombreCurso() {
	return nombreCurso;
}

public void setNombreCurso(String nombreCurso) {
	this.nombreCurso = nombreCurso;
}

public double getCantidadHorasPorDia() {
	return cantidadHorasPorDia;
}

public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
	this.cantidadHorasPorDia = cantidadHorasPorDia;
}

public int getCantidadDiasPorSemana() {
	return cantidadDiasPorSemana;
}

public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
	this.cantidadDiasPorSemana = cantidadDiasPorSemana;
}

public double getPrecioPorHora() {
	return precioPorHora;
}

public void setPrecioPorHora(double precioPorHora) {
	this.precioPorHora = precioPorHora;
}

public String getTurno() {
	return turno;
}

public void setTurno(String turno) {
	this.turno = turno;
}

public String[] getAlumnos() {
	return alumnos;
}

public void setAlumnos(String[] alumnos) {
	this.alumnos = alumnos;
}

@Override
public String toString() {
	return "Curso [nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia
			+ ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", precioPorHora=" + precioPorHora + ", turno="
			+ turno + ", alumnos=" + Arrays.toString(alumnos) + "]";
}



}
