package ar.edu.unlam.tallerjava.cuentas;

import java.util.ArrayList;

public class CuentaMultipersona {
	
	private ArrayList<Cliente> cotitulares = new ArrayList<Cliente>();
	
	public void agregarCotitular(Cliente cliente){
		
		cotitulares.add(cliente);
	}
}
