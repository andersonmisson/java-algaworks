package br.com.kotrix.capitulo_07_05;

public class TesteCorreioEletronico {
	public static void main(String[] args) {
		

	CorreioEletronico correio = new CorreioEletronico();

	/*// metodo 1
	String[] emails = new String[2];
	emails[0] = "joaodascouver@joao.com";
	emails[1] = "maria@maria.com";
	
	correio.enviarEmail(emails);
	*/
	
	// Metodo 2
	// correio.enviarEmail(new String[] {"joao@joao.com", "maria@maria.com"});
	
	// Metodo 3 com Varargs (...), agora fica mais facil, adicionar e tirar
	correio.enviarEmail("joao@joao.com","maria@maria.com","pedro@pedro.com");
	
	}
}