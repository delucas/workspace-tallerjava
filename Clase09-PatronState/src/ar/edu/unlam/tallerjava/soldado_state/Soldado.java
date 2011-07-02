package ar.edu.unlam.tallerjava.soldado_state;

public class Soldado {

	protected int cantidadSangre;
	protected int cantidadAgujerosDeBala;
	protected EstadoSalud estadoSalud;

	public void recibirDisparo() {
		this.estadoSalud = this.estadoSalud.recibirDisparo(this);
	}

	public void recibirCuracion() {

	}

	public int getCantidadSangre() {
		return cantidadSangre;
	}

	public void setCantidadSangre(int cantidadSangre) {
		this.cantidadSangre = cantidadSangre;
	}

	public int getCantidadAgujerosDeBala() {
		return cantidadAgujerosDeBala;
	}

	public void setCantidadAgujerosDeBala(int cantidadAgujerosDeBala) {
		this.cantidadAgujerosDeBala = cantidadAgujerosDeBala;
	}

	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}

	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

}
