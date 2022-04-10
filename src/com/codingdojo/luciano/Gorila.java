package com.codingdojo.luciano;

public class Gorila extends Mamifero {

	

	public void lanzarAlgo() {
		System.out.println("El gorila arrojó algo");
		nivelDeEnergía -= 5;
	}
	
	public void comerBananas() {
		System.out.println("Comer bananas me poner energético");
		nivelDeEnergía += 10;
	}
	
	public void escalar() {
		System.out.println("He trepado un árbol estoy cansado");
		nivelDeEnergía -=10;
	}
	
	
}

