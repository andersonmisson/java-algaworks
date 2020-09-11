package br.com.kotrix.capitulo_05_10;

public class Contador {
	
	public static int COUNT = 0; // Static s� usa na Classe
	public static final double PI = 3.14; // Final, ele n�o pode mudar a variavel
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora �: " + Contador.COUNT);
	}
}