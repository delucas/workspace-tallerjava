package ar.edu.unlam.tallerjava.eclipse.figuras;

public class Circulo {

	private double radio;

	public double getPerimetro(){
		return 2 * Math.PI * this.getRadio();
	}
	
	public double getArea(){
		return Math.PI * this.getRadio() * this.getRadio();
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	
}
