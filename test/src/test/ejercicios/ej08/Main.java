package test.ejercicios.ej08;

import java.util.Scanner;


public class Main {
	
	/*
	 * Hacer un enumerado de Piedra, Papel y Tijera. 
	 * Generar una funci�n qu� devuelva un enumerado aleatorio, 
	 * y una funci�n qu� diga s� el jugador 1 gan� al jugador 2. 
		Y �jugar 10 partdidas�, llevar un conteo de qui�n es el qu� gana.
	 */

	public static void main(String[] args) { 
		
		// Objeto de la Partida
		Juego juego = new Juego(10);
 
		 juego.juegaFor();
		 juego.dameResultado();
		 
		 juego.juegaWhile();
		 juego.dameResultado();
		 
		 juego.juegaDoWhile();
		 juego.dameResultado();
		 
		 // == RECOGER Un valor escogido
		 VALOR.mostrarTodos();
			
		Scanner console = new Scanner(System.in); 
			
		int valor = console.nextInt();
		VALOR escogido = VALOR.get(valor);
		System.out.println("Escogido:"+valor+" - "+escogido);
		

	}

}
