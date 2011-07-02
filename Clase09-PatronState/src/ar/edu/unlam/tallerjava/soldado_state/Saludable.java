package ar.edu.unlam.tallerjava.soldado_state;

public class Saludable implements EstadoSalud {
	
	private static Saludable instance = new Saludable();
	
	private Saludable(){
		
	}
	
	public static Saludable getInstance() {
		return instance;
	}
	
	public EstadoSalud recibirDisparo(Soldado soldado) {
		soldado.cantidadSangre -= 100;
		System.out.println("AHHHHHHH");
		soldado.cantidadAgujerosDeBala++;
		return Herido.getInstance();
		
	}

	public EstadoSalud recibirCuracion(Soldado soldado) {
		System.out.println("Gracias ya estoy saludable");
		return Saludable.getInstance();
	}
}
