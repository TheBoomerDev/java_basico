package test.ejercicios.ej08;

public class Juego {
	
	// Puntuacion de los jugadores
	private int jugador1 = 0;
	private int jugador2 = 0;
	
	// Numero de partidas a jugar
	private int partidas = 0;
	
	public Juego(int numeroPartidas) {
		this.partidas = numeroPartidas;
	} 

	public void dameResultado() {
		System.out.println("Numero Partidas: "+this.partidas);
		System.out.println("Gana pj01: "+jugador1);
		System.out.println("Gana pj02: "+jugador2);
	}
	
	private void reiniciar() {
		jugador1 = 0;
		jugador2 = 0;
	}

	private void juega() {
		// "Mano" de los jugadores
		VALOR pj01 = VALOR.getAleatorio();
		VALOR pj02 = VALOR.getAleatorio();
														
	    // Comprobamos quien a ganado
		boolean gana01 = this.gana(pj01, pj02);
														
		// Contamos las victorias
	    if (gana01) {
	    	jugador1++;
		}else {
			jugador2++;
		}
	}
	
	public void juegaFor() {
		this.reiniciar();
		for (int i = 0; i < partidas; i++) {
			this.juega();
		}
		
	}
	
	public void juegaWhile() {
		this.reiniciar();
		int contadorPartidas = 0;
		while(partidas>contadorPartidas) {
			this.juega();
			contadorPartidas++;
		}
		
	}
	
	public void juegaDoWhile() {
		this.reiniciar();
		int contadorPartidas = 0;
		do {
			this.juega();						
			contadorPartidas++;
		}while(partidas>contadorPartidas);
	}

	private boolean gana(VALOR valor1, VALOR valor2) {
		
		if (valor1 == VALOR.PAPEL) {
			if (valor2 == VALOR.PIEDRA) return true;
			if (valor2 == VALOR.TIJERA) return false;
		}
		
		if (valor1 == VALOR.PIEDRA) {
			if (valor2 == VALOR.PAPEL) return false;
			if (valor2 == VALOR.TIJERA) return true;
		}
		
		if (valor1 == VALOR.TIJERA) {
			if (valor2 == VALOR.PAPEL) return true;
			if (valor2 == VALOR.PIEDRA) return false;
		}
		
		// EMPATE - valor1 == valor 2
		return false;
	}
	
}
