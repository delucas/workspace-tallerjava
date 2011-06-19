package ar.edu.unlam.tallerjava.patrones;

/**
 * La clase Impresora, que [supuestamente] imprime.
 * Es un Singleton.
 * @author lucas
 *
 */
public class Impresora {

	// 1. La única instancia existente
	private static Impresora instance = new Impresora();

	// 2. El constructor privado
	private Impresora(){
		
	}

	// 3. El único punto de acceso, controlado
	public static Impresora getInstance(){
		return instance ;
	}
	
	// 4. Los métodos propios de la Impresora
	
	/**
	 * El método imprimir, recibe una cadena y
	 * la imprime
	 */
	public String imprimir(String cadenaAImprimir){
		return "Estoy imprimiendo: " + cadenaAImprimir;
	}
}
