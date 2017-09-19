package gt.edu.url.examen1.impl;

public class MonstruoAire extends Monstruo {
	
	public MonstruoAire(String elemento){
		this.setElementoPrimario(elemento);
		
	}
	
	public void volar(){
		System.out.println("Soy un monstruo de aire "
				+this.getNombre() + " y estoy volando ");
	}

}
