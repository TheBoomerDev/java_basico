package test.ejercicios.ej08;

import java.util.Random;

public enum VALOR {
	PAPEL,
	PIEDRA,
	TIJERA;
	
	public static VALOR getAleatorio() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
