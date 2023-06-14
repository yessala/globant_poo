package entidad;

public class Circunferencia {
	private double radio;

	public Circunferencia() {
		
	}
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	// getter y setter
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + "]";
	}


	
}
