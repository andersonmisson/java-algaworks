package br.com.kotrix.capitulo_05_10;

public class Contador {
	
	public static int COUNT = 0; // Static só usa na Classe
	public static final double PI = 3.14; // Final, ele não pode mudar a variavel
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}
}