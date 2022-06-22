package test.enums;

import java.util.ArrayList;
import java.util.List;

import test.enums.Deportista.ClaseDeDeporte;

public class Partido {
	
	List<Deportista> equipo1 = new ArrayList<Deportista>();
	List<Deportista> equipo2 = new ArrayList<Deportista>();
	
	public void iniciarPartido() {
		
		Deportista deportista = new Deportista(18, 56, 165, ClaseDeDeporte.BALONCESTO);
		this.equipo1.add(deportista);
	}

}
