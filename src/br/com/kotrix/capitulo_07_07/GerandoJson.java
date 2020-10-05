package br.com.kotrix.capitulo_07_07;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.kotrix.capitulo_07_07.modelo.Cliente;
import br.com.kotrix.capitulo_07_07.modelo.Endereco;
import br.com.kotrix.capitulo_07_07.modelo.Telefone;

public class GerandoJson {
	
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Das Águas, 10", "SÃO PAULO", "SP");
		
		Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-1111");
		Telefone comercial = new Telefone("COMERCIAL", "11 3222-2222");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		Cliente cliente = new Cliente("João Da Silva", 28, endereco, telefones);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		Cliente c2 = gson.fromJson(json, Cliente.class);
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefones().get(0).getNumero());
		
	}

}
