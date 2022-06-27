package test.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import test.enums.DIASEMANA;
import test.enums.Partido;

public class Listas {

	public static void main(String[] args) {

		List<String> listaNombres = new ArrayList<String>();
		listaNombres = new LinkedList<>(); // Cola en Bucle -> Ultimo, conectado con Primero
		
		// Añadir a la lista
		listaNombres.add("valor1");
		listaNombres.add("valor2");
		listaNombres.add("valor3");
		listaNombres.add("valor4");
		listaNombres.add("valor5");
		
		// Recoger de la lista
		listaNombres.get(0); // El indice o posición a recoger
		
		
		// Diccionario -> Clave-Valor
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("valor1", 15);
		map.put("valor2", 20);
		map.put("valor3", 1000);
		map.put("valor4", 1500);
		map.put("valor5", 2);
		
		Integer value = map.get("valor1");
		
		
	}

}
