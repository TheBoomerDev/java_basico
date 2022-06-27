package test.ejercicios;

public class ej06 {

	/*
	 * Hacer una lista de los primeros 150 números (0-150) y sumar en una variable los impares, 
	 * y en otra los pares. Pasar por pantalla el resultado de ambas
	 */
	
	public static void main(String[] args) {
		int impar = 0;
		int par = 0;
		
		for (int i = 0; i < 150; i++) {
			boolean esPar = (i % 2) == 0;
			if (esPar) {
				par = par + i;
			}else {
				impar = impar + i;
			}			
		}
		System.out.println("Suma Par:"+par);
		System.out.println("Suma ImPar:"+impar);
	}
	
}
