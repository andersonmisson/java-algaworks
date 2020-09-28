package br.com.kotrix.capitulo_06_17;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Representa uma organização que possui um conjunto de políticos
 * que governam um estado, município, etc.
 * 
 * @author Anderson Misson
 *
 */

public class Governo {
	
	/**
	 * Mapa com uma lista de políticos por estado da federacão.
	 * A chave do mapa faz referência à sigla do partido e
	 * o valor à uma lista de políticos do partido.
	 */

	// Armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;
	
	/**
	 * Construtor do governo.
	 * Instancia um mapa vazio de políticos.
	 */
	// Construtor
	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	/**
	 * Adiciona um político à relação de políticos.
	 * 
	 * @param partidoPolitico sigla do partido político
	 * @param politico político a ser adicionado para o partido
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		//Recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido
		if(politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		// adiciona o político recebido com parâmetro à lista de políticos
		politicos.add(politico);
		
		// Adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
		
	}
	
	/**
	 * Consulta e calcula os gastos com salários de todos os políticos
	 * do partido informado.
	 * O valor retornado é em Reais.
	 * 
	 * @param partidoPolitico sigla do partido político a ser filtrado na consulta
	 * @return valor de gastos com salários, em reais
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca dos politicos para o partido e cago informados
		// e cálculo dos salários
		
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if(politicos != null) {
			for(Politico politico: politicos) {
				total = total.add(politico.getCargo().getSalario());
			}
		}
		return total;
	}
	
	/**
	 * Consulta e calcula os gastos com salários de todos os políticos
	 * do cargo e partido político informados.
	 * O valor retornado é em Reais.
	 * 
	 * @param cargo cargo dos políticos a ser filtrado na consulta
	 * @param partidoPolitico sigla do partido político a ser filtrado na consulta
	 * @return valor de gastos com salários, em reais
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
		BigDecimal total = BigDecimal.ZERO;
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		if(politicos !=null) {
			for(Politico politico: politicos) {
				// verifica se cargo do politico é igual ao cargo informado no parametro
				if(politico.getCargo().equals(cargo)) {
					total = total.add(politico.getCargo().getSalario());
				}
			}
		}
		return total;
	}
	
}
