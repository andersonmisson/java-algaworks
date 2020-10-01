package br.com.kotrix.capitulo_07_04.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.kotrix.capitulo_07_04.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_04.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory{

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente", "root", "root");
			
		} catch (Exception e) {
			throw new RuntimeException("Erro Recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new jdbcClienteDAO(connection);
	}
	
}
