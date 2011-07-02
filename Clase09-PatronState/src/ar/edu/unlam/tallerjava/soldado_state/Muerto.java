package ar.edu.unlam.tallerjava.soldado_state;

public class Muerto implements EstadoSalud{
	
	private static Muerto instance = new Muerto();
	
	private Muerto(){
		
	}

	public static Muerto getInstance() {
		return instance;
	}
	
	public EstadoSalud recibirDisparo(Soldado soldado) {
		soldado.cantidadAgujerosDeBala++;
		return Muerto.getInstance();
	
	}

	public EstadoSalud recibirCuracion(Soldado soldado) {
		System.out.println("He revivido");
		soldado.cantidadSangre=7000;
		soldado.cantidadAgujerosDeBala=0;
		return Saludable.getInstance();
	
	}
	
}
