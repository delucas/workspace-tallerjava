package ar.edu.unlam.tallerjava.eclipse.calculadora;

public class Calculadora {
	
	private int sumaEnMemoria;

	public int sumaConMemoria (int sumando){
		this.sumaEnMemoria += sumando;
		return this.sumaEnMemoria;
	}
	
	public void borrarMemoria(){
		this.sumaEnMemoria = 0;
	}
	
}
