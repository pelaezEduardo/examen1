package gt.edu.url.examen1.impl;

import gt.edu.url.examen.ds.ArrayQueue;
import gt.edu.url.examen.ds.ArrayStack;
import gt.edu.url.examen1.api.FabricaRanger;

public class FabricaRangerImpl implements FabricaRanger {

	ArrayQueue<Monstruo> cola = new ArrayQueue<>();
	ArrayStack<Monstruo> pila = new ArrayStack<>();
	
	
	@Override
	public void hacerAlgo() {
		System.out.println("Haciendo algo");
		
	}

	@Override
	public boolean apilar(Monstruo monstruo) {
		try {

			pila.push(monstruo);
			return true;	
		} catch (Exception e) {
			return false;
		}
		
		
	}

	@Override
	public boolean desapilar(Monstruo monstruo) {
		try {

			pila.pop();
			return true;	
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean encolar(Monstruo monstruo) {
		try {
			cola.enqueue(monstruo);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean desencolar(Monstruo monstruo) {
		try {
			cola.dequeue();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Monstruo fabricar(String elemento) {
		
		if(elemento == "FUEGO"){
			return new MonstruoFuego(elemento);
		}else if(elemento == "AIRE"){
			return new MonstruoAire(elemento);
		}else{
			return new Monstruo(elemento);
		}
		
	}

}
