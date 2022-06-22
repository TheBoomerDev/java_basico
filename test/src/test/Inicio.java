package test;

import java.util.ArrayList;
import java.util.List;

import test.enums.Deportista; 
import test.enums.TipoDeCarga;

public class Inicio {
	
	/*
	 * Ejemplos de incialización de las variables y los tipos de variable nativa.
	 */
	final int km = 10212;
	float precio = 12.3f;
	char letra = 'a';
	String cadenaTexto = "Hola, Mundo";
	boolean verdaderoFalso = false;

	public int convertir (float aux) {
		return (int) aux;
	}
	
	public void noConvertir() {
		
	}
	
	public static void main(String[] args) {
		
		final int km = 10212;
		float precio = 12.3f;
		char letra = 'a';
		String cadenaTexto = "Hola, Mundo";
		boolean verdaderoFalso = false;
		
		precio = 25f;
		letra = 'b';
		cadenaTexto = "Adios, Mundo Cruel";
		
		float porcentaje = 2f;
		
		
		if (km < precio) {
			System.out.println(precio);
		}else {
			System.out.println(km);
		}
		
		// Operadores Matematicos:
		
		// SUMA
		float precioFinal = precio + 3f + porcentaje;
		// RESTA
		precioFinal = precio - porcentaje;
		// DIVISION
		precioFinal = precio / porcentaje;
		// MULTIPLICACION
		precioFinal = precio * porcentaje;
		 
		// Casteo
		int precioKm = (int) precio;
		
		Producto lapiz = new Producto();
		lapiz.nombre = "Lapiz 02";
		lapiz.precio = 0.75f;
		lapiz.unidades = 10000;
		
		float valorLapiz = lapiz.valorTodos();
		
		Producto coche = new Producto();
		float valorCoche = coche.valorTodos();
		
		Inicio func = new Inicio();
		func.noConvertir();		
		
		Animal perro = new Animal("Canis Lupus");
		perro.restarVida(100);
		
		Animal gato = new Animal("Felix Catus");  
		
		Coche xsara = new Coche("Citroen Xsara");
		xsara.setPuertas(5);
		Coche picasso = new Coche("Citroen Picasso");
		picasso.setPuertas(5);
		Coche ferrari = new Coche("Ferrari"); 
		ferrari.setPuertas(3);
		
		int ruedas = xsara.getRuedas();
		System.out.println(ruedas);
		ruedas = ferrari.getRuedas();
		System.out.println(ruedas);
	
		int caballos = xsara.getMotor().caballos;
		
		List<Coche> coches = new ArrayList<Coche>();
		coches.add(xsara); // POS 0
		coches.add(picasso); // POS 1
		coches.add(ferrari); // POS 2
		
		coches.remove(0);
		
		Coche car = coches.get(2);
		  
		 

	}

}
