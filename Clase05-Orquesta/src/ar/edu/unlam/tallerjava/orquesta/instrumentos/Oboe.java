package ar.edu.unlam.tallerjava.orquesta.instrumentos;

import ar.edu.unlam.tallerjava.orquesta.afinador.Afinable;

public class Oboe extends InstrumentoViento implements Afinable{
	
	public void tocar(){
		System.out.println("Soy un Oboe que toca asi");
	}

	public void afinar(){
		System.out.println("Como afina este Oboe");
	}
}
