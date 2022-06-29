package test.ejercicios.ej09;
 
import java.util.ArrayList;
import java.util.Calendar; 
import java.util.List;
import java.util.Scanner;

import test.recogerTeclado.Empleado;

public class ej09 {
	
	/*
	 * Hacer un tipo de dato “Empleado” con los atributos: nombre, edad, sueldoMes, antiguedad.
		Hacer una función qué permita guardar en una lista los empleados, 
			y otra función qué “encuentre” un empleado por parte de su nombre y lo devuelva.
		Hacer una función qué devuelva el coste en sueldo de todos los empleados de la empresa.

	 */
	
	public static List<Empleado> empleados = new ArrayList<Empleado>();
	
	public static void guardarEmpleado() {
		// TODO: FIXME: Guardar Empleado
		
		// Nuevo Empleado
		Empleado nuevo = new Empleado();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = console.next();
		nuevo.setNombre(nombre);
		
		System.out.print("Edad: ");
		int edad = console.nextInt(); 
		nuevo.setEdad(edad);
		
		System.out.print("Sueldo: ");
		int sueldo = console.nextInt(); 
		nuevo.setSueldo(sueldo);
		
		System.out.print("Antiguedad (DD/MM/YYYY): ");
		String strFecha = console.next();
		
		
		/*
		 // FORMA 1 De Hacerlo: 
		String[] valores = strFecha.split("/");
		Date date = new Date();
		date.setDate( Integer.valueOf(valores[0]) );
		date.setMonth( Integer.valueOf(valores[1])-1 );
		date.setYear( Integer.valueOf(valores[2])-1900 );
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		nuevo.setAntiguedad(cal); 
		 
		 */
		
		/*
		 // FORMA 3 De Hacerlo: 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
		Date date = sdf.parse(strFecha);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		nuevo.setAntiguedad(cal); 
		 */
	 
		// FORMA 2 De Hacerlo: 
		String[] valores = strFecha.split("/");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(valores[0]) );
		cal.set(Calendar.MONTH, Integer.valueOf(valores[1])-1 );
		cal.set(Calendar.YEAR, Integer.valueOf(valores[2]) );
		nuevo.setAntiguedad(cal);   
		
		empleados.add(nuevo);
		
		System.out.println("=======================");
		System.out.println("= Empleado Guardado =");
		System.out.println("=======================");
		
		// Hacer que espere a tener que esperar a Enter.
		console.next();
		
		menu();
	}
	
	public static void buscarEmpleado() {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = console.next();
		
		// FORMA 1 - 
		Empleado empleado = new Empleado();
		for (Empleado currante : empleados) {
			if (currante.getNombre().contains(nombre)) {
				empleado = currante;
				break;
			}
		}
		System.out.println(empleado.toString());
		
		/*
		 
		 // Forma 2 - 
		for (int i = 0; i < empleados.size(); i++) {
			Empleado empleado = empleados.get(i);
			if (empleado.getNombre().contains(nombre)) {
				System.out.println(empleado.toString());
			}
		}
		 
		 */
		
		/*
		// Forma 3 - 
		Empleado currante = new Empleado();
		for (int i = 0; i < empleados.size(); i++) {
			currante = empleados.get(i);
			if (empleado.getNombre().contains(nombre)) {
				break;
			}
		}
		System.out.println(currante.toString());
		 */
		
		
		System.out.println("========================");
		System.out.println("= Listado de Empleados =");
		System.out.println("========================");
		menu();
	}
	
	public static void verCosteEmpleados() {

		int acumulador = 0;
		for (Empleado currante : empleados) {
			int sueldo = currante.getSueldo();
			acumulador = acumulador + sueldo;
		}
		
		String format = "Total Sueldos: %d";
		System.out.println( format.formatted(acumulador) );
		
		
		System.out.println("===========================");
		System.out.println("= Mostrar Coste Empleados =");
		System.out.println("===========================");
		menu();
	} 
	
	public static void menu() {
		Scanner console = new Scanner(System.in); 
		System.out.println("=======================");
		System.out.println("1) Guardar Empleado");
		System.out.println("2) Buscar");
		System.out.println("3) Ver Coste"); 
		System.out.println("=======================");
		System.out.println("0) Salir");
		System.out.println("=======================");
		
		System.out.print("¿Que Quieres?: ");
	    int length = console.nextInt(); 
	    
	    switch (length) {
		case 1: {
			guardarEmpleado();
			break;
		} 
		case 2: {
			buscarEmpleado();
			break;
		}
		case 3: {
			verCosteEmpleados();
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
