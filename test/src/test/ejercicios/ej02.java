package test.ejercicios;

public class ej02 {
	
	public static void main(String[] args) {
		
		int var1 = 125;
		int var2 = 125;
		
		int mayor=0;
		
		if (var1 > var2) {
			mayor = var1;
		}else{
			mayor = var2;
		}
		System.out.println(mayor);
		
		
		// ======================
		
		mayor = var1;
		
		if (var2 > var1) {
			mayor = var2;
		}
		System.out.println(mayor);
	}

}
