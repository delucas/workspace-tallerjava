package ar.edu.unlam.tallerjava.combate;

import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public class EstadoSaludable implements EstadoDeSalud {

	private static EstadoSaludable instance = new EstadoSaludable();

	private EstadoSaludable() {
	}

	public static EstadoSaludable getInstance(){
		return instance ;
	}

	@Override
	public EstadoDeSalud recibirDaño(int daño, UnidadDeCombate unidad) {
		
		int nivelDeSalud = unidad.getNivelDeSalud();
		EstadoDeSalud estadoFinal;
		if (nivelDeSalud > daño) {
			unidad.setNivelDeSalud(nivelDeSalud - daño);
			estadoFinal = EstadoSaludable.getInstance();
		} else {
			unidad.setNivelDeSalud(0);
			estadoFinal = EstadoMuerto.getInstance();
		}
		return estadoFinal;
	}

	@Override
	public int obtenerValorDaño(UnidadDeCombate unidadDeCombate) {
		if (unidadDeCombate.getMovimientosRestantes() == 0) {
			return 0;
		}
		return unidadDeCombate.getDañoMaximo();
	}
	
}
