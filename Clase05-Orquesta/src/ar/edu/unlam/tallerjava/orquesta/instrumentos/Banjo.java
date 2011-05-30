package ar.edu.unlam.tallerjava.orquesta.instrumentos;

import ar.edu.unlam.tallerjava.orquesta.afinador.Afinable;

public class Banjo extends InstrumentoDeCuerdas implements Afinable {
	
	public void tocar(){
		System.out.println("Soy un banjo que suena asi");
	}

	public void afinar(){
		System.out.println("soy un banjo en afinamiento");
	}
}
