package br.com.kotrix.capitulo_05_22;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {
		
		System.out.println("*************************************");
		System.out.println("RELAT�RIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");

		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		
		System.out.println("*************************************");
	}

}
