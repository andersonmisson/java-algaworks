package br.com.kotrix.capitulo_07_01;

public class ExemploClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_de_software";
		
		// Separa cada palavra pela parte ' _ ' e coloca em um array
		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
		}
	}
	
}
