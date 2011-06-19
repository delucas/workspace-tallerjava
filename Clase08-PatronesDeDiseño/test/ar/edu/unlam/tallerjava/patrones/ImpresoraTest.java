package ar.edu.unlam.tallerjava.patrones;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ImpresoraTest {

	Impresora miImpresora;
	
	@Before
	public void setUp(){
		miImpresora = Impresora.getInstance();
	}
	
	@Test
	public void testQueSeaSingleton(){
		Impresora miOtraImpresora = Impresora.getInstance();
		
		Assert.assertSame(miImpresora, miOtraImpresora);
	}
	
	@Test
	public void testQueImprimaCorrectamente(){
		String esperado = "Estoy imprimiendo: Hola";
		String obtenido = miImpresora.imprimir("Hola");
		
		Assert.assertEquals(esperado, obtenido);
	}
	
}
