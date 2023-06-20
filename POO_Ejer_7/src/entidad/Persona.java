package entidad;
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.

// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.


/**
 * @author yessa
 *
 */
public class Persona {
	private String nombre;
	private int edad;
	//sexo like a char M (mujer), H (homre), O (otro)
	private String sexo;
	private double peso;
	private double altura;

	//Constructores
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	//getters y setters
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	

	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + "]";
	}



}


