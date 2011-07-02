package ar.edu.unlam.tallerjava.soldado_state;

public interface EstadoSalud {
	public EstadoSalud recibirDisparo(Soldado soldado);
	public EstadoSalud recibirCuracion(Soldado soldado);
}
