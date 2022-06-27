package test.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.enums.DIASEMANA;
import test.enums.Partido;

public class MapYHashMap {
	 
	public static void main(String[] args) {
	
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
