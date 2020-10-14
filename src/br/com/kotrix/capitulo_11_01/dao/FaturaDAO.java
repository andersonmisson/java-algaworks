package br.com.kotrix.capitulo_11_01.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.kotrix.capitulo_11_01.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas(){
		// Obviamente você buscaria 
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350));
		faturas.add(new Fatura("maria@maria.com", 150));
		faturas.add(new Fatura("maria@jose.com", 290));
		
		return faturas;
	}
	
}
