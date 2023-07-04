/**
 * 
 */
package entidad;

/**
 * @author yessa
 *
 *Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 

 */
public class Raices {
	private int a;
	private int b;
	private int c;
	/**
	 * Constructors
	 */
	public Raices() {
	}
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	
	
}
