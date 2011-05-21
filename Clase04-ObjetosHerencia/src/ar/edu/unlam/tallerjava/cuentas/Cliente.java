package ar.edu.unlam.tallerjava.cuentas;

public class Cliente {
	
	private String nombre;
	private String dni;
	
	public void recibirMensaje(String mensaje){
		System.out.println(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
