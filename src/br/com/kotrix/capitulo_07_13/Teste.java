package br.com.kotrix.capitulo_07_13;

public class Teste {
	
	public static void main(String[] args) {
		long posicao = 10;
		long valor = Fibonacci.calcula(posicao);
		
		System.out.println("F(" + posicao + ") = " + valor);
	}

}
