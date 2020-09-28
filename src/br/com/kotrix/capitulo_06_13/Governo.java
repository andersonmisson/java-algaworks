package br.com.kotrix.capitulo_06_13;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Governo {

	// Armazena uma lista de pol�ticos por estado da federa��o
	private Map<String, List<Politico>> partidosPoliticos;
	
	// Construtor
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		//Recupera a lista de pol�ticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se n�o existir uma lista de pol�ticos para o partido informado,
		// devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido
		if(politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o pol�tico recebido com par�metro � lista de pol�ticos
		politicos.add(politico);
		
		// Adiciona a lista de pol�ticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
		
	}
	
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca dos politicos para o partido e cago informados
		// e c�lculo dos sal�rios
		
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if(politicos != null) {
			for(Politico politico: politicos) {
				total = total.add(politico.getCargo().getSalario());
			}
		}
		return total;
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos pol�ticos para o partido e cargo informados
		// e c�lculo dos sal�rios
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if(politicos !=null) {
			for(Politico politico: politicos) {
				// verifica se cargo do politico � igual ao cargo informado no parametro
				if(politico.getCargo().equals(cargo)) {
					total = total.add(politico.getCargo().getSalario());
				}
			}
		}
		return total;
	}
	
}
