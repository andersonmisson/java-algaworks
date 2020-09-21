package br.com.kotrix.capitulo_05_21;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p; // Fazendo um casting
		pp.dataValidade = "10/03/2020";
		
		p.imprimirDescricao();

	}

}
