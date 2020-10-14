package br.com.kotrix.capitulo_11_06.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

import br.com.kotrix.capitulo_11_05.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		// Antigamente era assim
		/*
		  Calendar c = Calendar.getInstance();
		  c.set(Calendar.YEAR, 1980);
		  c.set(Calendar.MONTH, 8);
		  Date dataNascimento = c.getTime();
		 */
		
		// Muito mais facil no JAVA 8, usando LocalDate , MONTH usa ENUM automatico
		Cliente cliente = new Cliente("João Da Silva", LocalDate.of(2000, Month.AUGUST, 01));
		
		// Antigamente para se calcular a idade era assim
		/*
		Calendar idade = Calendar.getInstance();
		idade.set(Calendar.YEAR, 2004);
		
		Calendar hoje = Calendar.getInstance();
		
		long tempoEmMilisegundos = hoje.getTimeInMillis() - idade.getTimeInMillis();
		long anos = tempoEmMilisegundos / 1000 / 60 / 60 / 24 / 30 / 12;
		System.out.println(anos);
		*/
		
		// Bem mais facil, getYears para saber a diferença em Anos, se for dias getDays
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
		} else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
		}
		
	}

}
