package ar.edu.unlam.tallerjava.combate;

import junit.framework.Assert;

import org.junit.Test;

import ar.edu.unlam.tallerjava.combate.unidades.Arquero;
import ar.edu.unlam.tallerjava.combate.unidades.Caballero;
import ar.edu.unlam.tallerjava.combate.unidades.UnidadDeCombate;

public class BatallaTest {

	@Test
	public void queGaneElRojoNoHabiendoAzul(){
		
		Ejercito rojo = new Ejercito();
		rojo.addUnidad(buildArquero());
		
		Ejercito azul = new Ejercito();
				
		Batalla batalla = new Batalla(rojo, azul);
		
		Assert.assertEquals("Rojo", batalla.combatir());
		
	}
	
	@Test
	public void queGaneElRojoHabiendoAzul(){
		
		Ejercito rojo = new Ejercito();
		rojo.addUnidad(buildCaballero());
		
		Ejercito azul = new Ejercito();
		azul.addUnidad(buildArquero());
				
		Batalla batalla = new Batalla(rojo, azul);
		
		Assert.assertEquals("Rojo", batalla.combatir());
		
	}

	private UnidadDeCombate buildCaballero() {
		return new Caballero();
	}

	private UnidadDeCombate buildArquero() {
		return new Arquero();
	}
	
}
