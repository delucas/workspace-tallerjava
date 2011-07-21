package ar.edu.unlam.tallerjava.combate;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public class Ejercito {

	private List<UnidadDeCombate> unidades;

	public Ejercito() {
		this.unidades = new LinkedList<UnidadDeCombate>();
	}
	
	public void addUnidad(UnidadDeCombate unidad){
		this.unidades.add(unidad);
	}
	
	public UnidadDeCombate getProximaUnidad(){
		for (UnidadDeCombate cadaUnidad : unidades) {
			if (EstadoSaludable.getInstance().equals(cadaUnidad.getEstado())){
				return cadaUnidad;
			}
		}
		return null;
	}
	
	
}
