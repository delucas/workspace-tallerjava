package ar.edu.unlam.tallerjava.cuentas;

public class CuentaSueldo extends Cuenta {
	
		private String empleador;
		private String cuitEmpleador;
		private static final int EXTRACCIONESPERMITIDAS=5;
		private int extraccionesRealizadas=0;
		
		public CuentaSueldo(){
			super();
		}
		
		public String getEmpleador() {
			return empleador;
		}
		public void setEmpleador(String empleador) {
			this.empleador = empleador;
		}
		public String getCuitEmpleador() {
			return cuitEmpleador;
		}
		public void setCuitEmpleador(String ciutEmpleador) {
			this.cuitEmpleador = ciutEmpleador;
		}
		public int getExtraccionesRealizadas() {
			return extraccionesRealizadas;
		}
		public void setExtraccionesRealizadas(int extraccionesRealizadas) {
			this.extraccionesRealizadas = extraccionesRealizadas;
		}
		
		public void extraer(double saldo){
				if(this.getSaldo()>saldo){
					super.extraer(saldo);
					if(this.getExtraccionesRealizadas()>=CuentaSueldo.EXTRACCIONESPERMITIDAS){
						super.extraer(10.0);
						this.titular.recibirMensaje("Se a cobrado un recargo en su extraccion por haber superado el l�mite permitido");
					}						
					 this.setExtraccionesRealizadas(this.getExtraccionesRealizadas()+1);
					 
				}
				else{
					this.titular.recibirMensaje("No puede realizarse la extraccion requerida.");
				 }
				 
		}
}
		
		 


