package br.com.kotrix.capitulo_07_10;

public class SplitString {

	public static void main(String[] args) {
		
		String texto1 = "O Java é uma linguagem orientada a objetos";
		
		String[] palavras = texto1.split(" ");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		
		String texto2 = "O42Java11é33uma9linguagem9orientada1a8objetos.";
		
		// d significa DIGITO [0-9]
		String[] palavras2 = texto2.split("\\d+");
		for (String palavra2 : palavras2) {
			System.out.println(palavra2);
		}

	}

}
