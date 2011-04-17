package ar.edu.unlam.tallerjava.sintaxis;

public class Sumadora {

	private int resultado = 0;
	
	public int calcularSumatoriaPares(int limite) {
		for (int i = 0; i < limite; i++){
			if (i % 2 == 0) {
				this.resultado += i;
			}
		}
		return this.resultado;
	}
	
}
