package entidad;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @author yessa
 *
 */
public class Alquiler {
private String peliculaAquilada;
private LocalDate fechaInicio;
private LocalDate fechaFin;
private int precio;

public Alquiler() {
}
public Alquiler(String peliculaAquilada, LocalDate fechaInicio, LocalDate fechaFin, int precio) {
	this.peliculaAquilada = peliculaAquilada;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.precio = precio;
}
public String getPeliculaAquilada() {
	return peliculaAquilada;
}
public void setPeliculaAquilada(String peliculaAquilada) {
	this.peliculaAquilada = peliculaAquilada;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public LocalDate getFechaFin() {
	return fechaFin;
}
public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
@Override
public String toString() {
	return "Alquiler [peliculaAquilada=" + peliculaAquilada + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
			+ ", precio=" + precio + "]";
}

}
