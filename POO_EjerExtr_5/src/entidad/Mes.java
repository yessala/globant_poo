/**
 * 
 */
package entidad;

/**
 * @author yessa
 *
 *Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class Mes {
	private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private int select;
	private String option;
	/**
	 * 
	 */
	public Mes() {
	}
	/**
	 * @param select
	 */
	public Mes(int select) {
		this.select = select;
	}

	/**
	 * @return the mes
	 */
	public String[] getMeses() {
		return meses;
	}
	
	
	/**
	 * @return the select
	 */
	public int getSelect() {
		return select;
	}
	/**
	 * @param select the select to set
	 */
	public void setSelect(int select) {
		this.select = select;
	}
	
	
	/**
	 * @return the option
	 */
	public String getOption() {
		return option;
	}
	/**
	 * @param option the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}
	@Override
	public String toString() {
		return "Mes [select=" + select + ", option=" + option + "]";
	}


	
} 


