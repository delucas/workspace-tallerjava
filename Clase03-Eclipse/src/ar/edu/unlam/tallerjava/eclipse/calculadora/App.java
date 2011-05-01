package ar.edu.unlam.tallerjava.eclipse.calculadora;

public class App {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();

		System.out.println("0 + 10 = " + calculadora.sumaConMemoria(10));
		System.out.println("10 + 20 = " + calculadora.sumaConMemoria(20));
		
	}

}
