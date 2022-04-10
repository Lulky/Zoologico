package com.codingdojo.luciano;

public class TestGorila {

	public static void main(String[] args) {
		
		Gorila gorila1= new Gorila();
		gorila1.lanzarAlgo();
		gorila1.lanzarAlgo();
		gorila1.lanzarAlgo();
		
		gorila1.comerBananas();
		gorila1.comerBananas();
		
		gorila1.escalar();
		
		int energia = gorila1.mostrarEnergía();
		System.out.println(energia);
		
	}
}
