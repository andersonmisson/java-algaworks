package br.com.kotrix.capitulo_05_21;

public class ProdutoPerecivel extends Produto{
	
	String dataValidade; //Por enquanto, ainda n�o aprendemos a class Date

	@Override
	public void imprimirDescricao() {
		// Digitar a l�gica
		System.out.println("Descri��o: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
		
	}
	
	

}
