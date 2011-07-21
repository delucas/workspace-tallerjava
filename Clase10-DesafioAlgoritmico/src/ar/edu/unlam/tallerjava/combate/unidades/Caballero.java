package ar.edu.unlam.tallerjava.combate.unidades;

import ar.edu.unlam.tallerjava.combate.EstadoSaludable;

public class Caballero extends UnidadDeCombate{

	public Caballero() {
		super(2);
		this.estado = EstadoSaludable.getInstance();
		this.nivelDeSalud = 200;
		this.daño = 20;
	}
	
}
