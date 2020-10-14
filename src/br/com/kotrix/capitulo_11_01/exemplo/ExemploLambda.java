package br.com.kotrix.capitulo_11_01.exemplo;

import java.util.List;

import br.com.kotrix.capitulo_11_01.dao.FaturaDAO;
import br.com.kotrix.capitulo_11_01.modelo.Fatura;
import br.com.kotrix.capitulo_11_01.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		/*for (Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		}*/
		
		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}
	
}