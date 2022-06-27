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
		
		// Partidos de la Semana
		Map<DIASEMANA, Partido> mapPartidos = new HashMap<DIASEMANA, Partido>();
		
		mapPartidos.put(DIASEMANA.LUNES, new Partido());
		mapPartidos.put(DIASEMANA.MARTES, new Partido());
		mapPartidos.put(DIASEMANA.MIERCOLES, new Partido());
		
		// Sobreescribe el objeto para el Lunes
		mapPartidos.put(DIASEMANA.LUNES, new Partido());
		
		// Más Complicado 
		Map<DIASEMANA, List<Partido>> muchosPartidos = new HashMap<DIASEMANA, List<Partido>>();
		
		List<Partido> partidos = new ArrayList<Partido>();
		
		muchosPartidos.put(DIASEMANA.LUNES, partidos);
		muchosPartidos.put(DIASEMANA.MARTES, partidos);
		muchosPartidos.put(DIASEMANA.MIERCOLES, partidos); 
		
		// Diccionario Mixto
		Map<String, Object> dictMixto = new HashMap<String, Object>();
		dictMixto.put("Entero", 121241);
		dictMixto.put("Texto", "Hola Mundo");
		dictMixto.put("existe", true);
		
		Object obj = dictMixto.get("Entero");
		Integer jInt = (Integer) obj; 
		
		
		// Diccionario de Diccionarios
		Map<DIASEMANA, Map<DIASEMANA, List<Partido>>> multiple = new HashMap<DIASEMANA, Map<DIASEMANA, List<Partido>>>();
		
		Map<DIASEMANA, List<Partido>> valueMap = new HashMap<DIASEMANA, List<Partido>>();
		
		valueMap.put(DIASEMANA.MARTES, new ArrayList<Partido>());
		
		multiple.put(DIASEMANA.LUNES, valueMap);
		
		
		System.out.println("FINALIZO");
	}

}
