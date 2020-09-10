package br.com.kotrix.capitulo_04_03;

public class ExercicioTelevisor {
	
	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		if(canal == novoCanal) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume (Integer novoVolume) {
		if (novoVolume == volume) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			System.out.println("Volume alterado para " + volume);
		}
	}

	public static void main(String[] args) {
		
		ExercicioTelevisor tv = new ExercicioTelevisor();
		
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}

}
