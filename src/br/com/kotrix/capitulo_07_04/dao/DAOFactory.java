package br.com.kotrix.capitulo_07_04.dao;

import br.com.kotrix.capitulo_07_04.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDaoFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
}
