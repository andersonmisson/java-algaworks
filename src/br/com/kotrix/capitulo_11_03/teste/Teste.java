package br.com.kotrix.capitulo_11_03.teste;

import br.com.kotrix.capitulo_11_03.compra.Compra;
import br.com.kotrix.capitulo_11_03.impressao.Impressora;
import br.com.kotrix.capitulo_11_03.impressao.impressoras.ImpressoraHP;

public class Teste {
	
	public static void main(String[] args) {
		// Impressora i = new ImpressoraHP();
		
		// Esse c no Lambda reconheceu na interface funcional (Só tem um método, então é facil achar)
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " + c);
		};
		
		
		Compra compra = new Compra("Sabonete", 2.5);
		
		i.imprimir(compra);
		
	}

}
