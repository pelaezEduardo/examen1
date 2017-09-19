/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *
 * @author tuxtor
 */
public class Monstruo {
   
	public Monstruo(){
		
	}
	
	public Monstruo(String elemento){
		this.setElementoPrimario(elemento);
		
	}
	
	private String nombre;
	private String elementoPrimario;
	private String color;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getElementoPrimario() {
		return elementoPrimario;
	}
	public void setElementoPrimario(String elementoPrimario) {
		this.elementoPrimario = elementoPrimario;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void agigantarse(){
		System.out.println("Soy un monstruo  "
				+this.getNombre() + " y estoy creciendo ");
	}
	public void golpear(){
		System.out.println("Soy un monstruo "
				+this.getNombre() + " y estoy golpeando ");
	}
	public void caminarLento(){
		System.out.println("Soy un monstruo "
				+this.getNombre() + " y estoy caminando lento ");
	}
	
	
}
