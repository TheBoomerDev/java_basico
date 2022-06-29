package test.ejercicios.ej10; 

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import test.recogerTeclado.Empleado;

public class Main {
	
	/*
	 * Hacer un programa de gastos de la casa. 
		Tipos de Dato: 
			- Gasto (nombre, fecha, precio)
			- Ingreso (nombre, fecha, ingreso)
		Funciones: 
		- Añadir Ingreso, 
		- Añadir Gasto, 
		- Cálculo Gastos en Rango Fechas, 
		- Cálculo Ingresos en Rango Fechas
		- Cálculo Balance en Fechas
	 */
	
	private static List<Movimiento> ingresos = new ArrayList<Movimiento>();
	private static List<Movimiento> gastos = new ArrayList<Movimiento>();
	
	private static Calendar recogerFecha(Scanner console) {

		System.out.print("Fecha (DD/MM/YYYY): ");
		String strFecha = console.next(); // Formato: DD/MM/YYYY 
	 
		// FORMA 2 De Hacerlo: 
		String[] valores = strFecha.split("/");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(valores[0]) );
		cal.set(Calendar.MONTH, Integer.valueOf(valores[1])-1 );
		cal.set(Calendar.YEAR, Integer.valueOf(valores[2]) ); 
		
		return cal;
	}
	
	public void addIngreso() {
		/*
		 * 1.- Pedir los datos para generar el moviemiento
		 * 2.- Llamar a Cartera.addIngreso()
		 */
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = console.next();
		
		System.out.print("Valor: ");
		int valor = console.nextInt();
		
		Calendar cal = recogerFecha(console);
		
		// Tengo el moviemiento
		Movimiento ingreso = new Movimiento(nombre, valor);
		ingreso.setFecha(cal);

		ingresos.add(ingreso);
		
	}
	
	public void addGasto() {
		/*
		 * 1.- Pedir los datos para generar el moviemiento
		 * 2.- Llamar a Cartera.addIngreso()
		 */
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = console.next();
		
		System.out.print("Valor: ");
		int valor = console.nextInt();
		
		Calendar cal = recogerFecha(console);
		
		// Tengo el moviemiento
		Movimiento gasto = new Movimiento(nombre, valor);
		gasto.setFecha(cal);

		gastos.add(gasto);
	}
	
	public void calculoGastosEntreFechas() {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Fecha Inicio: ");
		Calendar fechaInicio = recogerFecha(console);
		System.out.print("Fecha Fin: ");
		Calendar fechaFin = recogerFecha(console);
		
		int sumatorio = 0;
		
		for (Movimiento gasto : gastos) {
			
			// Comprobamos si está en rango
			Calendar fechaGasto = gasto.getFecha();
			
			if ( (fechaGasto.after(fechaInicio)) && (fechaGasto.before(fechaFin)) ) {
				// En este punto se que es una fecha que me interesa
				sumatorio = sumatorio + gasto.getValor();
			}
			  
			/*
			 // Otra forma de hacerlo
			if (fechaGasto.after(fechaFin)) continue;
			if (fechaGasto.before(fechaInicio)) continue;
			
			// En este punto se que es una fecha que me interesa
			sumatorio = sumatorio + gasto.getValor(); 
			 */ 
			
		}
		
		String mensaje = "Suma de Gastos: %d".formatted(sumatorio);
		System.out.println(mensaje);
		
		
	}
	
	
	public void menu() {
		Scanner console = new Scanner(System.in); 
		System.out.println("=======================");
		System.out.println("1) Añadir Ingreso");
		System.out.println("2) Añadir Gasto");
		System.out.println("3) Cálculo Gastos en Rango Fechas");
		System.out.println("4) Cálculo Ingresos en Rango Fechas"); 
		System.out.println("5) Cálculo Balance en Fechas"); 
		System.out.println("=======================");
		System.out.println("0) Salir");
		System.out.println("=======================");
		
		System.out.print("¿Que Quieres?: ");
	    int length = console.nextInt(); 
	    
	    switch (length) {
		case 1: {
			// Añadir Ingreso
			addIngreso();
			break;
		} 
		case 2: {
			// Añadir Gasto
			addGasto();
			break;
		}
		case 3: {
			// Cálculo Gastos en Rango Fechas
			calculoGastosEntreFechas();
			break;
		} 
		case 4: {
			// Cálculo Ingresos en Rango Fechas
			break;
		} 
		
		case 5: {
			// Cálculo Balance en Fechas
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
