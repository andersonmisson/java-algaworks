package br.com.kotrix.capitulo_05_12;

public class TesteOperacaoEnum {

	public static void main(String[] args) {

		OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
		
		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resulado �: " + resultado1);
		
		// For Avan�ado com ENUM
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
		
	}
	
}