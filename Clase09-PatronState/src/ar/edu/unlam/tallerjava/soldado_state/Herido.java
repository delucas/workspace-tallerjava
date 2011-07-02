package ar.edu.unlam.tallerjava.soldado_state;

public class Herido implements EstadoSalud{
	
	private static Herido instance = new Herido();
	
	private Herido(){
		
	}
	
	public static Herido getInstance() {
		return instance;
	}
	
	public EstadoSalud recibirDisparo(Soldado soldado) {
		soldado.cantidadAgujerosDeBala++;
		soldado.cantidadSangre = 0;
		System.out.println("AHHHHHHHHHHHHH");
		return Muerto.getInstance();
	
	}

	public EstadoSalud recibirCuracion(Soldado soldado) {
		soldado.cantidadAgujerosDeBala--;
		System.out.println("Gracias");
		return Saludable.getInstance();
		
	}
}
