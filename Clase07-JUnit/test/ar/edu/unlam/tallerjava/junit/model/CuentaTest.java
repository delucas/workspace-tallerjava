package ar.edu.unlam.tallerjava.junit.model;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.tallerjava.junit.exceptions.DepositoNoValidoException;

import junit.framework.Assert;

public class CuentaTest {

	private static final double SALDO_INICIAL = 1000;
	private static final double DEPOSITO = 100;
	private static final double DEPOSITO_NO_VALIDO = -100;
	
	private Cuenta cuenta = null;

	@Before
	public void setUp(){
		cuenta  = new Cuenta(SALDO_INICIAL);
	}
	
	@Test
	public void testCreacion() {
		Assert.assertEquals("El saldo no ha sido el esperado", SALDO_INICIAL, cuenta.getSaldo());
	}
	
	@Test
	public void testDepositoSatisfactorio() throws DepositoNoValidoException {
		cuenta.depositar(DEPOSITO);
		Assert.assertEquals("El saldo luego del depósito no ha sido el esperado", SALDO_INICIAL + DEPOSITO, cuenta.getSaldo());
	}
	
	@Test(expected=DepositoNoValidoException.class)
	public void testDepositoNoSatisfactorio() throws DepositoNoValidoException {
		cuenta.depositar(DEPOSITO_NO_VALIDO);
	}
	
}
