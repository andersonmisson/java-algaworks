package br.com.kotrix.capitulo_07_10;

public class ReplaceString {

	public static void main(String[] args) {
		
		String texto1 = "O Valor do Produto é R$ @x@.";
		
		String texto2 = "O Valor do Produto é R$ @xxxxxx@.";

		String novoTexto1 = texto1.replaceAll("@x@", "2.50");
		// quando se coloca o +, você quer um numero infinito de x
		String novoTexto2 = texto2.replaceAll("@x+@", "7.50");
		
		System.out.println(novoTexto1);
		System.out.println(novoTexto2);
	}

}
