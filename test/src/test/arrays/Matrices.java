package test.arrays;

import java.util.ArrayList;
import java.util.List;

public class Matrices {

	public static void main(String[] args) {

		// Matriz 1 Dimension -> Array
		List<Integer> matriz1D = new ArrayList<Integer>();
		
		// Recorrer 
		for (int i = 0; i < matriz1D.size(); i++) {
			Integer valor = matriz1D.get(i);
			System.out.println("Coordernadas de valor:"+valor+" -> "+i);
		}
		
		// Matriz 2 Dimensiona -> Array-Array
		List<ArrayList<Integer>> matriz2D = new ArrayList<ArrayList<Integer>>();
		
		// Recorrer
		for (int i = 0; i < matriz2D.size(); i++) {
			List<Integer> segundaDimension = matriz2D.get(i);
			for (int j = 0; j < segundaDimension.size(); j++) {
				Integer valor = segundaDimension.get(j);
				System.out.println("Coordernadas de valor:"+valor+" -> "+i+"-"+j);
			}
		}
		
		// Matriz 3 Dimensiona -> Array-Array
		List<ArrayList<ArrayList<Integer>>> matriz3D = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		for (int i = 0; i < matriz3D.size(); i++) {
			List<ArrayList<Integer>> segundaDimension = matriz3D.get(i);
			for (int j = 0; j < segundaDimension.size(); j++) {
				ArrayList<Integer> terceraDimension = segundaDimension.get(j);
				for (int k = 0; k < args.length; k++) {
					Integer valor = terceraDimension.get(k);
					System.out.println("Coordernadas de valor:"+valor+" -> "+i+"-"+j+"-"+k);
				}
				
			}
		} 
		
		// Matriz 4 Dimensiona -> Array-Array
		List<ArrayList<ArrayList<ArrayList<Integer>>>> matriz4D = new ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>>();
		for (int i = 0; i < matriz4D.size(); i++) {
			List<ArrayList<ArrayList<Integer>>> segundaDimension = matriz4D.get(i);
			for (int j = 0; j < segundaDimension.size(); j++) {
				ArrayList<ArrayList<Integer>> terceraDimension = segundaDimension.get(j);
				for (int k = 0; k < terceraDimension.size(); k++) {
					ArrayList<Integer> cuartaDimension = terceraDimension.get(k);
					for (int l = 0; l < cuartaDimension.size(); l++) {
						Integer valor = cuartaDimension.get(k);
						System.out.println("Coordernadas de valor:"+valor+" -> "+i+"-"+j+"-"+k+"-"+l);
					}
				}
				
			}
		}
		
		
	}

}
