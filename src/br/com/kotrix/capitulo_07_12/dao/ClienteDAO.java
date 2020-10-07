package br.com.kotrix.capitulo_07_12.dao;

import org.apache.log4j.Logger;

import br.com.kotrix.capitulo_07_12.model.Cliente;


public class ClienteDAO {
	
	private static Logger logger = Logger.getLogger(ClienteDAO.class);
		
		public void salvar(Cliente cliente) {
			if (cliente == null) {
				// Regra para dizer ao usuario informar o nome
				logger.warn("Cliente está nulo");
				return;
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug("Salvando o cliente: " + cliente);
			}
			
			// Salvaria o cliente no banco
			
			logger.debug("Cliente salvo com sucesso.");
		}
		
	}