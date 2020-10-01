package br.com.kotrix.capitulo_07_04.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kotrix.capitulo_07_04.dao.ClienteDAO;
import br.com.kotrix.capitulo_07_04.dao.DAOException;
import br.com.kotrix.capitulo_07_04.modelo.Cliente;

public class jdbcClienteDAO implements ClienteDAO{

	private Connection connection;
	
	
	// Lembre-se de criar o construtor
	public jdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {
		try {
		String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());
		
		// Esse connection precisa de um TRY/Catch, para caso não consiga conectar no sql.
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.executeUpdate();
		
		} catch(SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
			
		} finally { // Sempre precisamos fechar uma connexão ao banco de dados depois de aberto e tem Try/Catch também
			
			try {
			this.connection.close();
			
			}catch(Exception e) {
				
			}
		}
	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
		Cliente cliente = null;
		
		try {
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); // Pega a consulta e devolve para o ResultSet
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}
			
		} catch (SQLException se) {
			throw new DAOException("Erro Buscando Cliente", se);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return cliente;
	}

	@Override
	public List<Cliente> buscarTodos() {
		
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			String sql = "select * from cliente";
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				
				clientes.add(cliente);
			}
			
		} catch (SQLException se) {
			throw new DAOException("Erro Buscando Cliente", se);
		}finally {
			try {
				this.connection.close();
			} catch (Exception e) {
				
			}
		}
		
		return clientes;
	}

}
