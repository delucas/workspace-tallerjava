package ar.edu.unlam.tallerjava.cuentas.app;

import ar.edu.unlam.tallerjava.cuentas.Cliente;
import ar.edu.unlam.tallerjava.cuentas.CuentaSueldo;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre("alejandro");
		cliente.setDni("17224999");
		
		CuentaSueldo cuentaSueldo = new CuentaSueldo();
		cuentaSueldo.setTitular(cliente);
		cuentaSueldo.depositar(500.0);
		System.out.println("SALDO: "+cuentaSueldo.getSaldo());
		cuentaSueldo.extraer(300.0);
		System.out.println("SALDO: "+cuentaSueldo.getSaldo());
		cuentaSueldo.extraer(500.0);
		
		
		Cliente cliente2 = new Cliente();
		CuentaSueldo cuentaSueldo2 = new CuentaSueldo();
		
		cuentaSueldo2.setTitular(cliente2);
		cuentaSueldo2.depositar(1000.0);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(200);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(200);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(100);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(100);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(100);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(100);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());
		cuentaSueldo2.extraer(100);
		System.out.println("SALDO: "+cuentaSueldo2.getSaldo());

	}

}
