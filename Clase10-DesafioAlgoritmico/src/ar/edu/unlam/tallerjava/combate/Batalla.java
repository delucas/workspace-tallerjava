package ar.edu.unlam.tallerjava.combate;

import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public class Batalla {

	private Ejercito ejercitoAzul;
	private Ejercito ejercitoRojo;

	public Batalla(Ejercito ejercitoRojo, Ejercito ejercitoAzul) {
		this.ejercitoRojo = ejercitoRojo;
		this.ejercitoAzul = ejercitoAzul;
	}
	
	public String combatir(){
		UnidadDeCombate unidadRoja;
		UnidadDeCombate unidadAzul;
		boolean hayGanador = false;
		String ganador = "";
		while (!hayGanador) {
			unidadRoja = ejercitoRojo.getProximaUnidad();
			unidadAzul = ejercitoAzul.getProximaUnidad();
			
			if (unidadRoja == null) {
				return "Azul";
			}
			
			if (unidadAzul == null) {
				return "Rojo";
			}
			
			confrontarUnidades(unidadRoja, unidadAzul);
			
		}
		
		return ganador;
		
	}

	private void confrontarUnidades(UnidadDeCombate unidadRoja,
			UnidadDeCombate unidadAzul) {
		
		boolean hayGanador = false;
		while (!hayGanador ){
			
			int movimientos = calcularMovimientosRonda(unidadRoja, unidadAzul);
			
			for (int i = 0; i < movimientos; i++) {
				unidadRoja.recibirDaño(unidadAzul.getDaño());
				unidadAzul.recibirDaño(unidadRoja.getDaño());
			}
			
			if (!EstadoSaludable.getInstance().equals(unidadRoja.getEstado())
					|| !EstadoSaludable.getInstance().equals(unidadAzul.getEstado()) ){
				hayGanador = true;
			}
			
			resetearMovimientos(unidadRoja);
			resetearMovimientos(unidadAzul);
		}
		
	}

	private int calcularMovimientosRonda(UnidadDeCombate unidadRoja,
			UnidadDeCombate unidadAzul) {
		return Math.max(unidadRoja.getMovimientosRestantes(), unidadAzul.getMovimientosRestantes());
		
	}

	private void resetearMovimientos(UnidadDeCombate unidad) {
		unidad.resetearMovimientos();
		
	}
	
}
