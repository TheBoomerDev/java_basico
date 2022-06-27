package test.recogerTeclado;

import java.util.Scanner;

public class EjemploMenu {

	public static void funcion1() {
		System.out.println("1) Opcion 1");
		menu();
	}
	
	public static void funcion2() {
		System.out.println("2) Opcion 2");
		menu();
	}
	
	public static void funcion3() {
		System.out.println("3) Opcion 3");
		menu();
	}
	
	public static void funcion4() {
		System.out.println("4) Opcion 4");
		menu();
	}
	
	
	public static void funcion5() {
		System.out.println("5) Opcion 5");
		menu();
	}
	
	public static void menu() {
		Scanner console = new Scanner(System.in); 
		System.out.println("=======================");
		System.out.println("1) Opcion 1");
		System.out.println("2) Opcion 2");
		System.out.println("3) Opcion 3");
		System.out.println("4) Opcion 4");
		System.out.println("5) Opcion 5");
		System.out.println("=======================");
		System.out.println("0) Salir");
		System.out.println("=======================");
		
		System.out.print("¿Que Quieres?: ");
	    int length = console.nextInt();
	    
	    switch (length) {
		case 1: {
			funcion1();
			break;
		} 
		case 2: {
			funcion2();
			break;
		}
		case 3: {
			funcion3();
			break;
		}
		case 4: {
			funcion4();
			break;
		}
		case 5: {
			funcion5();
			break;
		}
		case 0:
			System.out.println("Adios");
		default:
			// Salir del programa 
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		menu();
	}

}
