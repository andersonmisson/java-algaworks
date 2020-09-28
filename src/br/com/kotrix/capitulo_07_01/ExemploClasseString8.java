package br.com.kotrix.capitulo_07_01;

public class ExemploClasseString8 {

	public static void main(String[] args) {
		
		String s = "Java";
		
		// Procura em que posição está a primeira letra escolhida
		int indice = s.indexOf('a');
		System.out.println(indice);
		
		// Procura em que posição está a ultima letra escolhida
		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}
	
}
