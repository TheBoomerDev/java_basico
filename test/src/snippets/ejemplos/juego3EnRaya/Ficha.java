package snippets.ejemplos.juego3EnRaya;

import java.util.Random; 

public enum Ficha {
	PEQ,
	MED,
	GRA;
	
	public static boolean meCome(Ficha ficha1, Ficha ficha2) {
		if (ficha1 == Ficha.GRA) return false;
		if ((ficha1 == Ficha.MED) && (ficha2 !=  Ficha.GRA)) return false;
		if ((ficha1 == Ficha.PEQ) && (ficha2 == Ficha.PEQ)) return false;
		if (ficha1 == ficha2) return false;	
		
		return true;
	}
	
	public static Ficha getAleatorio() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
