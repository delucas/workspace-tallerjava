package ar.edu.unlam.tallerjava.combate.unidades;

import ar.edu.unlam.tallerjava.combate.EstadoSaludable;

public class Catapulta extends UnidadDeCombate{

	public Catapulta() {
		super(1);
		this.estado = EstadoSaludable.getInstance();
		this.nivelDeSalud = 500;
		this.daño = 100;
	}
	
}
