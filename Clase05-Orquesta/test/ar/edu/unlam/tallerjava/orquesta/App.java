package ar.edu.unlam.tallerjava.orquesta;

import ar.edu.unlam.tallerjava.orquesta.afinador.Afinador;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.Banjo;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.Flauta;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.Laud;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.Oboe;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.Tuba;

public class App {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();
		Banjo banjo = new Banjo();
		Laud laud = new Laud();
		Tuba tuba = new Tuba();
		Flauta flauta = new Flauta();
		Oboe oboe = new Oboe();
		banjo.setTono(7);
		System.out.println("El tono de cuerda1 es: " + banjo.getTono());
		orquesta.addCuerda(banjo);
		orquesta.addCuerda(laud);
		orquesta.addViento(tuba);
		orquesta.addViento(flauta);
		orquesta.addViento(oboe);
		orquesta.tocar();

		Afinador afinador = new Afinador();
		afinador.afinar(banjo);
		afinador.afinar(oboe);

	}

}
