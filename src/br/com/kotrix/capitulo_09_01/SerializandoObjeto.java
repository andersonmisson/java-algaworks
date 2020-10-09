package br.com.kotrix.capitulo_09_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import br.com.kotrix.capitulo_09_01.model.Pessoa;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("João Da Silva");
		p.setIdade(25);
		p.setProfissao("Motorista");
		
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
			out.writeObject(p);
			System.out.println("Objeto Salvo com Sucesso.");
			
			
		} catch (IOException e) {
			System.err.println("Erro salvando o objeto. " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
