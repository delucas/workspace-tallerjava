package ar.edu.unlam.tallerjava.combate.unidades;

import ar.edu.unlam.tallerjava.combate.EstadoSaludable;

public class Arquero extends UnidadDeCombate{

	public Arquero() {
		super(5);
		this.estado = EstadoSaludable.getInstance();
		this.nivelDeSalud = 100;
		this.daño = 10;
	}
	
}
