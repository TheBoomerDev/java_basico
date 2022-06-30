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
	
	public static VALOR get(int pos) {
		 VALOR[] lista = values();
		 return lista[pos];
	}
	
	public static void mostrarTodos() {
		 VALOR[] lista = values();
		 for (int i = 0; i < lista.length; i++) {
			System.out.println("%d) - %s".formatted(i, lista[i]));
		}
	}
}
