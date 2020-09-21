package br.com.kotrix.capitulo_05_21;

public class ProdutoPerecivel extends Produto{
	
	String dataValidade; //Por enquanto, ainda não aprendemos a class Date

	@Override
	public void imprimirDescricao() {
		// Digitar a lógica
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
		
	}
	
	

}
