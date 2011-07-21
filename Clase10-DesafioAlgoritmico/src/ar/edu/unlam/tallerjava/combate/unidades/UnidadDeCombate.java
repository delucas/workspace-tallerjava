package ar.edu.unlam.tallerjava.combate.unidades;

import ar.edu.unlam.tallerjava.combate.EstadoDeSalud;

public abstract class UnidadDeCombate {

	
	public final int CANTIDAD_DE_MOVIDAS;
	
	protected int nivelDeSalud;

	protected int movimientosRestantes;
	protected int daño;

	protected EstadoDeSalud estado;
	
	public UnidadDeCombate(int cantidadMovidas) {
		this.CANTIDAD_DE_MOVIDAS = cantidadMovidas;
		this.movimientosRestantes = cantidadMovidas;
	}
	
	public void recibirDaño(int daño) {
		this.estado = this.estado.recibirDaño(daño, this);
	}
	
	public int getNivelDeSalud() {
		return nivelDeSalud;
	}
	public void setNivelDeSalud(int nivelDeSalud) {
		this.nivelDeSalud = nivelDeSalud;
	}
	
	public int getDaño() {
		return this.estado.obtenerValorDaño(this);
	}
	
	public int getDañoMaximo() {
		return this.daño;
	}

	public EstadoDeSalud getEstado() {
		return estado;
	}

	public void resetearMovimientos() {
		this.movimientosRestantes = this.CANTIDAD_DE_MOVIDAS;
		
	}

	public int getMovimientosRestantes() {
		return movimientosRestantes;
	}
	
	
	
}
