package br.com.kotrix.capitulo_06_17;

import java.math.BigDecimal;

/**
 * Representa o cargo de um pol�tico.
 * Um cargo possui um sal�rio fixo, o qual � pago sem contar com as
 * verbas e aux�lios extraordin�rios. 
 * 
 * @author Anderson Misson
 *
 */

public class Cargo {
	
	/**
	 * Descri��o do cargo. Um nome que define a fun��o do pol�tico,
	 * como por exemplo: vereador, deputado estadual, etc.
	 */
	
	private String descricao;
	
	/**
	 * O valor do sal�rio dos pol�ticos que possuem o cargo.
	 * N�o inclui verbas e aux�lios extraordin�rios.
	 */
	private BigDecimal salario;
	
	// Getters and Setters
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
}
