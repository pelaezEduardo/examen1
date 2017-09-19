package gt.edu.url.examen1.impl;

public class MonstruoFuego extends Monstruo {
	
	public MonstruoFuego(String elemento){
		this.setElementoPrimario(elemento);
		
	}
	
	public void quemar(){
		System.out.println("Soy un monstruo de fuego "
				+this.getNombre() + " y estoy quemando ");
	}

}
