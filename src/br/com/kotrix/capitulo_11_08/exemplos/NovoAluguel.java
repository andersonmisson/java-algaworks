package br.com.kotrix.capitulo_11_08.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import br.com.kotrix.capitulo_11_07.model.Aluguel;
import br.com.kotrix.capitulo_11_07.model.Carro;
import br.com.kotrix.capitulo_11_07.model.Cliente;

public class NovoAluguel {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
	    Carro carro = new Carro("Gol", 90.0, Year.of(2012));
	    
	    LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now()
	    		, LocalTime.of(LocalTime.now().getHour(), 0)); // Hora fechada, tipo, ele pegou o carro 16:04, sistema vai 16h
	    
	    LocalDateTime dataEHoraPrevistaParaDevolucao = 
	    		LocalDateTime.now().plusDays(3).plusHours(2);
	    
	    Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
	    
	    imprimirRecibo(aluguel);
	}

	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println(">>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<");
	    System.out.println("Carro: " + aluguel.getCarro().getModelo());
	    System.out.println("Cliente: " + aluguel.getCliente().getNome());
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	    System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
	    System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}
	
}