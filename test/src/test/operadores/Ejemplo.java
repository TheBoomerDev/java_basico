package test.operadores;

public class Ejemplo {
	
	/*
	 
	 A B | && - || - !=
	 -------------------
	 F F | F  - F  - F
	 F T | F  - T  - T
	 T F | F  - T  - T 
	 T T | T  - T  - F 
	 
	 
	 && -> AND
	 || -> OR
	 != -> XOR => Distinto de
	 
	 */

	public static void main(String[] args) {

		int valor1 = 0;
		int valor2 = 1;
		int valor3 = 2;
		
		String estoEsNulo = null;
		
		// Comprobar con if y 1 boolean
		if(valor1 > 0) {
			System.out.println("System");
		}
		
		// Comprobar con if y 2 boolean
		if ((valor1 > 0) && (valor2 < 5)) {
			// Valor1 > 0 Y valor2 < 5
			System.out.println("Valor1 > 0 Y valor2 < 5");
		}
		
		if ((valor1 > 0) || (valor2 < 5)) {
			// Valor1 > 0 O valor2 < 5
			System.out.println("Valor1 > 0 O valor2 < 5");
		}
		
		
		/*
		 * Comprueba en orden, y si alguno es true. Entra sin comprobar el resto
		 */
		if (estoEsNulo == null || estoEsNulo.isEmpty() || estoEsNulo.length() <= 0|| estoEsNulo.trim().length() <= 0) {
			System.out.println("Entró Dentro");
		}

	}

}
