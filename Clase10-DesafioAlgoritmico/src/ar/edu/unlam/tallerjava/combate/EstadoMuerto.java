package ar.edu.unlam.tallerjava.combate;

import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public class EstadoMuerto implements EstadoDeSalud {

	private static EstadoMuerto instance = new EstadoMuerto();

	private EstadoMuerto() {
	}

	public static EstadoMuerto getInstance(){
		return instance ;
	}

	@Override
	public EstadoDeSalud recibirDaño(int daño, UnidadDeCombate unidad) {
		return EstadoMuerto.getInstance();
	}

	@Override
	public int obtenerValorDaño(UnidadDeCombate unidadDeCombate) {
		return 0;
	}
	
}
