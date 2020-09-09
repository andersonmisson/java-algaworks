package br.com.kotrix.capitulo_03_08;

public class Principal {
	
	public static void main (String[] args) {
		Carro seuCarro = new Carro();
		
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		seuCarro.dono.nome = "José Pereira"; // Depois de Instanciado, agora vai funcionar
		
		System.out.println(seuCarro.dono.nome);
		
	}

}
