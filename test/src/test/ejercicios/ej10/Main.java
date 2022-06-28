package test.ejercicios.ej10; 

import java.util.Scanner;

public class Main {
	
	/*
	 * Hacer un programa de gastos de la casa. 
		Tipos de Dato: 
			- Gasto (nombre, fecha, precio)
			- Ingreso (nombre, fecha, ingreso)
		Funciones: 
		- A�adir Ingreso, 
		- A�adir Gasto, 
		- C�lculo Gastos en Rango Fechas, 
		- C�lculo Ingresos en Rango Fechas
		- C�lculo Balance en Fechas
	 */
	
	
	public void menu() {
		Scanner console = new Scanner(System.in); 
		System.out.println("=======================");
		System.out.println("1) A�adir Ingreso");
		System.out.println("2) A�adir Gasto");
		System.out.println("3) C�lculo Gastos en Rango Fechas");
		System.out.println("4) C�lculo Ingresos en Rango Fechas"); 
		System.out.println("5) C�lculo Balance en Fechas"); 
		System.out.println("=======================");
		System.out.println("0) Salir");
		System.out.println("=======================");
		
		System.out.print("�Que Quieres?: ");
	    int length = console.nextInt(); 
	    
	    switch (length) {
		case 1: {
			// A�adir Ingreso
			break;
		} 
		case 2: {
			// A�adir Gasto
			break;
		}
		case 3: {
			// C�lculo Gastos en Rango Fechas
			break;
		} 
		case 4: {
			// C�lculo Ingresos en Rango Fechas
			break;
		} 
		
		case 5: {
			// C�lculo Balance en Fechas
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
	 
		// Iniciamos la App y Llamamos al Menu
		Main app = new Main();
		app.menu();

	}

}
