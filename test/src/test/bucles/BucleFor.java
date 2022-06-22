package test.bucles;

import java.util.ArrayList;
import java.util.List;

public class BucleFor {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Mundo");
		lista.add("Que");
		lista.add("Tal");
		lista.add("Estais");
		

		for (int i = 0; i < lista.size(); i++) {
			String cadena = lista.get(i);
			System.out.println(cadena);
		}
		
		for (String cadena : lista) {
			System.out.println(cadena);
		} 
		
		
		
	}
	
}
