package test.ejercicios.ej09;

import java.util.ArrayList;
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
		
		System.out.print("Antiguedad: ");
		// TODO: FIXME: Hacer una función
		
		empleados.add(nuevo);
		
		System.out.println("=======================");
		System.out.println("= Empleado Guardado =");
		System.out.println("=======================");
		menu();
	}
	
	public static void buscarEmpleado() {
		// TODO: FIXME: Buscar Empleado
	}
	
	public static void verCosteEmpleados() {
		// TODO: FIXME: Ver Coste Empleados
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


	}

}
