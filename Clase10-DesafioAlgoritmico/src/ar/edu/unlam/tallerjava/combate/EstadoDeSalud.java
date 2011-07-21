package ar.edu.unlam.tallerjava.combate;

import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public interface EstadoDeSalud {

	public EstadoDeSalud recibirDaño(int daño, UnidadDeCombate unidad);

	public int obtenerValorDaño(UnidadDeCombate unidadDeCombate);

}
