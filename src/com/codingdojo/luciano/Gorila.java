package com.codingdojo.luciano;

public class Gorila extends Mamifero {

	

	public void lanzarAlgo() {
		System.out.println("El gorila arroj� algo");
		nivelDeEnerg�a -= 5;
	}
	
	public void comerBananas() {
		System.out.println("Comer bananas me poner energ�tico");
		nivelDeEnerg�a += 10;
	}
	
	public void escalar() {
		System.out.println("He trepado un �rbol estoy cansado");
		nivelDeEnerg�a -=10;
	}
	
	
}

