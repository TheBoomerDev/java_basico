package test.ejercicios.ej08;

import java.util.Scanner;


public class Main {
	
	/*
	 * Hacer un enumerado de Piedra, Papel y Tijera. 
	 * Generar una función qué devuelva un enumerado aleatorio, 
	 * y una función qué diga sí el jugador 1 ganó al jugador 2. 
		Y “jugar 10 partdidas”, llevar un conteo de quién es el qué gana.
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
