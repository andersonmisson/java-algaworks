package br.com.kotrix.capitulo_07_05;

public class CorreioEletronico {

	// public void enviarEmail(String[] emails) { // Antigamente se fazia assim
	public void enviarEmail(String... emails) { // VARARGS se faz assim, numero de argumentos fica variavel	
		
		// Percorrer todos os emails recebidos
		for (String email: emails) {
			// Envia e-mail
			System.out.println("E-mail enviado para " + email);
		}
	}
}
