package ar.edu.unlam.tallerjava.eclipse.figuras;

public class Cilindro {

	private Circulo base;
	private double altura;
	
	public double getVolumen(){
		return this.base.getArea() * this.altura;
	}

	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
