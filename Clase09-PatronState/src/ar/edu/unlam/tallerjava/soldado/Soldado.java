package ar.edu.unlam.tallerjava.soldado;

public class Soldado {
	private int cantidadSangre;
	private int cantidadAgujerosDeBala;
	private String estadoSalud;

	public void recibirDisparo() {
		if (this.estadoSalud == "Saludable") {
			this.cantidadSangre -= 100;
			System.out.println("AHHHHHHH");
			this.cantidadAgujerosDeBala++;
			this.estadoSalud = "Herido";
		} else if (this.estadoSalud == "Herido") {
			this.cantidadAgujerosDeBala++;
			this.cantidadSangre = 0;
			System.out.println("AHHHHHHHHHHHHH");
			this.estadoSalud="Muerto";
		}
		if(this.estadoSalud=="Muerto"){
			this.cantidadAgujerosDeBala++;
		}
	}

	public void recibirCuracion() {
		if (this.estadoSalud == "Saludable") {
			System.out.println("Gracias ya estoy saludable");

		}else if (this.estadoSalud == "Herido") {
			this.cantidadAgujerosDeBala--;
			System.out.println("Gracias");
			this.estadoSalud="Saludable";
		}
		if(this.estadoSalud=="Muerto"){
			System.out.println("He revivido");
			this.cantidadSangre=7000;
			this.cantidadAgujerosDeBala=0;
			this.estadoSalud="Saludable";
		}
		
	}
	

}
