package br.com.kotrix.capitulo_06_06;

public class TesteString {
	
	public static void main(String[] args) {
		// String, StringBuilder, StringBuffer
		
		String s = "Ol�"; // Criada a String "Ol�"
		s = s+ " Pessoal"; // Criada a Seting "Ol� Pessoal"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ol�"); // Existe a StringBuilder
		sb.append(" Pessoal"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
		
	}

}
