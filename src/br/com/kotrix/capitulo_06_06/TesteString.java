package br.com.kotrix.capitulo_06_06;

public class TesteString {
	
	public static void main(String[] args) {
		// String, StringBuilder, StringBuffer
		
		String s = "Olá"; // Criada a String "Olá"
		s = s+ " Pessoal"; // Criada a Seting "Olá Pessoal"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Olá"); // Existe a StringBuilder
		sb.append(" Pessoal"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
		
	}

}
