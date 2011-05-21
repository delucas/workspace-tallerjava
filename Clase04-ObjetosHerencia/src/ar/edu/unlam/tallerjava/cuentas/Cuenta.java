package ar.edu.unlam.tallerjava.cuentas;

public class Cuenta {
	
	protected String numero;
	protected Double saldo;
	protected Cliente titular;
	
	public Cuenta(){
		saldo=0.0;
	}
	
	public void depositar(Double saldo){
		
		this.saldo+=saldo;
	}
	
	public void extraer(Double saldo){
		
		this.saldo-=saldo;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Double getSaldo(){
		return this.saldo;
	}
}