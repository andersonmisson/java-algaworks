package br.com.kotrix.capitulo_05_23.caixa;

import br.com.kotrix.capitulo_05_23.impressao.Impressora;
import br.com.kotrix.capitulo_05_23.pagamento.Cartao;
import br.com.kotrix.capitulo_05_23.pagamento.Operadora;

public class Checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Pagamento foi negado!");
		}
	}
	
}