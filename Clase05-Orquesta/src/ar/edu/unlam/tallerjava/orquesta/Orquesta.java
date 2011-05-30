package ar.edu.unlam.tallerjava.orquesta;

import java.util.ArrayList;

import ar.edu.unlam.tallerjava.orquesta.instrumentos.InstrumentoDeCuerdas;
import ar.edu.unlam.tallerjava.orquesta.instrumentos.InstrumentoViento;

/**
 * 
 * @author Rodrigo Molina
 * @author Cristian Traverso
 * 
 */
public class Orquesta {

	private ArrayList<InstrumentoDeCuerdas> cuerdas = new ArrayList<InstrumentoDeCuerdas>();
	private ArrayList<InstrumentoViento> vientos = new ArrayList<InstrumentoViento>();

	public void tocar() {
		this.tocarVientos();
		this.tocarCuerdas();
	}

	public void tocarVientos() {
		for (InstrumentoViento instrumento : vientos){
			instrumento.tocar();
		}
	}

	public void tocarCuerdas() {
		for (InstrumentoDeCuerdas instrumento : cuerdas){
			instrumento.tocar();
		}
	}

	public boolean addCuerda(InstrumentoDeCuerdas instrumento) {
		return cuerdas.add(instrumento);
	}

	public boolean addViento(InstrumentoViento instrumento) {
		return vientos.add(instrumento);
	}

}
