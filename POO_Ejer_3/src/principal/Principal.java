package principal;

import entidad.Operacion;
import servicios.ServiciosOperaciones;

public class Principal {
	public static void main(String[] args) {
		ServiciosOperaciones so = new ServiciosOperaciones();
		Operacion op = so.crearOperacion();
		so.sumar(op.getNum1(), op.getNum2());
		
		System.out.println(op);		
		
	}
}
