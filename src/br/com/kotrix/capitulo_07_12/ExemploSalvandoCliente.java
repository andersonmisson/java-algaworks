package br.com.kotrix.capitulo_07_12;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import br.com.kotrix.capitulo_07_12.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_12.model.Cliente;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("./config/log4j.properties");
		
		logger.info("Iniciando a aplicação");
		
		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);
		
		logger.info("Finalizando a aplicação");
	}
}
