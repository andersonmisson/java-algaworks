package br.com.kotrix.capitulo_05_23.teste;

import br.com.kotrix.capitulo_05_23.caixa.Checkout;
import br.com.kotrix.capitulo_05_23.caixa.Compra;
import br.com.kotrix.capitulo_05_23.impressao.Impressora;
import br.com.kotrix.capitulo_05_23.impressao.impressoras.ImpressoraHP;
import br.com.kotrix.capitulo_05_23.pagamento.Cartao;
import br.com.kotrix.capitulo_05_23.pagamento.Operadora;
import br.com.kotrix.capitulo_05_23.pagamento.operadoras.Redecard;

public class TesteCheckout {

	public static void main(String[] args) {

		Operadora operadora = new Redecard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(150);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}