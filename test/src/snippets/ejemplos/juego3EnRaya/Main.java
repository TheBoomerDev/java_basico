package snippets.ejemplos.juego3EnRaya;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Juego juego = new Juego();
	
		boolean jugadorActual1 = true;
		
		Random rnd = new Random();
		
		while(juego.hayHuecos()) {
			
			// Ternaria
			Valor valor = (jugadorActual1) ? Valor.O : Valor.X;
			int nPj = (jugadorActual1) ? 1 : 2;
						
			Jugada jugada = new Jugada(valor, nPj);
			System.out.println("Juega -> "+jugada.toString());
			
			
			// Mientras no encuentre Hueco, sigue Jugando
			// (Como Dory: "Sigue Nadando...")
			boolean sigueJugando = true;
			
			while(sigueJugando) {
				
				int posY = rnd.nextInt(3);
				int posX = rnd.nextInt(3);
				
				// Comprobamos si está ocupada
				boolean ocupada = juego.estaOcupada(posX, posY);
				if (!ocupada) {
					juego.addJugada(jugada, posX, posY);
					sigueJugando = false;
					String formato = "%d-%d => %s".formatted(posX, posY, ocupada);
					System.out.println(formato);
				}
				 
			}  
			
			
			// TOGGLE de Valor (Intermitente) 
			jugadorActual1 = !jugadorActual1;
		}

		EstadoPartida estado = juego.comprobar();
		System.out.println("Final de Juego: "+estado);

	}

}
