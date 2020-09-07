package br.com.kotrix.capitulo_03_07;

public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";
		
		System.out.println(meuCarro.dono.nome);
	}
	
}