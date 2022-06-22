package test.baraja;

import test.baraja.Carta.PALO;

public class Juego {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		
		for (PALO palo : Carta.PALO.values()) {
			for (int i = 0; i < 12; i++) {
				Carta carta = new Carta(palo, 1+i); 
				baraja.addCarta(carta);
			}
		}  
		
		System.out.println(baraja);
		 
	}
}
