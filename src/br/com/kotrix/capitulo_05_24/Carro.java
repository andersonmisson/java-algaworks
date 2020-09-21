package br.com.kotrix.capitulo_05_24;

public class Carro implements Seguravel{
	
	private double valorMercador;
	private int anoFabricacao;

	public Carro(double valorMercador, int anoFabricacao) {
		super();
		this.valorMercador = valorMercador;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

}
