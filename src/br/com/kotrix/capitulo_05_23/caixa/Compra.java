package br.com.kotrix.capitulo_05_23.caixa;

import br.com.kotrix.capitulo_05_23.impressao.Imprimivel;
import br.com.kotrix.capitulo_05_23.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;

	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}
	
	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
	}

}