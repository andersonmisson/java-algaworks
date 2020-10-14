package br.com.kotrix.capitulo_11_02.exemplo;

import java.util.List;

import br.com.kotrix.capitulo_11_02.dao.FaturaDAO;
import br.com.kotrix.capitulo_11_02.modelo.Fatura;

public class Exemplo {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		/*for (Fatura f : faturasVencidas) {
			f.atualizarStatus();
		}*/
		
		//faturasVencidas.forEach(f -> f.atualizarStatus());
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
	}
	
}
