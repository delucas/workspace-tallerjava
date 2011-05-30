package ar.edu.unlam.tallerjava.orquesta.instrumentos;

public abstract class Instrumento {
	
	protected int tono;
	
	public abstract void tocar();
	
	public int getTono(){
		return this.tono;
	}
	
	public void setTono(int tono){
		this.tono = tono;
	}
	
}
