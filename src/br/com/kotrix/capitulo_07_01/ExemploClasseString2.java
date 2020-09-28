package br.com.kotrix.capitulo_07_01;

public class ExemploClasseString2 {

	public static void main(String[] args) {
		String s = "ALGAWORKS";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(8));
		// Como não vai até 9, vai dar erro
		System.out.println(s.charAt(9));
	}
	
}
