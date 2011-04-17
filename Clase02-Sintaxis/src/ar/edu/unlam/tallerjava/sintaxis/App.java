package ar.edu.unlam.tallerjava.sintaxis;

public class App {

	private static final int LIMITE = 100;

	public static void main(String[] args) {
		Sumadora sumadora = new Sumadora();
		int sumatoria = sumadora.calcularSumatoriaPares(LIMITE);
		System.out.println(sumatoria);

	}

}
