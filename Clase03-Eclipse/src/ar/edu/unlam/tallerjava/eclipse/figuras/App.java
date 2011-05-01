package ar.edu.unlam.tallerjava.eclipse.figuras;

public class App {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo.setRadio(1);
		System.out.println("El radio es " + circulo.getRadio());
		System.out.println("El area es " + circulo.getArea());
		System.out.println("El perimetro es " + circulo.getPerimetro());
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(2);
		cilindro.setBase(circulo);
		System.out.println("La altura es " + cilindro.getAltura());
		System.out.println("El volumen es " + cilindro.getVolumen());
		
	}
	
}
