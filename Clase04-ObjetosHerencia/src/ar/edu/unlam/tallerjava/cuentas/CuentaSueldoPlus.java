package ar.edu.unlam.tallerjava.cuentas;

public class CuentaSueldoPlus extends CuentaSueldo {
	
	private String descubierto;

	public String getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(String descubierto) {
		this.descubierto = descubierto;
	}
	
	public Double obtenerDisponible(){
		return null;
	}
	
	public void avisoDescubierto(){
		
	}

}
