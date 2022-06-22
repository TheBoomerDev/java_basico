package test.baraja;

import java.util.ArrayList;
import java.util.List;

public class Baraja {  
	
	private List<Carta> cartas = new ArrayList<Carta>();
	
	public void addCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	public Carta getCarta() {
		int posUltima = this.cartas.size() - 1;
		
		Carta carta = this.cartas.get(posUltima);
		
		return carta;
	}

}
