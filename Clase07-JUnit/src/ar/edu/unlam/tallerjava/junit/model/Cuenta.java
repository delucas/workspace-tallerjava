package ar.edu.unlam.tallerjava.junit.model;

import ar.edu.unlam.tallerjava.junit.exceptions.DepositoNoValidoException;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double cantidad) throws DepositoNoValidoException {
		if (cantidad <= 0) {
			throw new DepositoNoValidoException("Se intentó depositar una suma no válida. cantidad: " + cantidad);
		}
		this.saldo += cantidad;
	}
	
}
