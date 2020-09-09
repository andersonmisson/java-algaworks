package br.com.kotrix.capitulo_03_09;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; // 0
	boolean biCombustivel; // false
	
	// Proprietario dono; // modo errado de declarar
	
	Proprietario dono = new Proprietario(); // Agora sim.
}
