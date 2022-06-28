package test.argumentos;

public class Sobreescritura {
	
	/*
	 * Sobreescribimos una función con el mismo nombre, para poder usar
	 * solo los parametros que necesitemos en cada caso.
	 */
	public void func1(String req01, String req02, String req03) {
		
	}
	
	public void func1(String req01, String req02) {
		func1(req01, req02, "");
	}

	public void func1(String req01) {
		func1(req01, "");
	}
	
	// =================
	// Podemos llamar a 2 funciones exactamente igual, siempre y cuando los parametros de entrada
	// sean diferentes.
	public int getX(int entero) {
		return 0;
	}
	
	public int getX(String str) {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		
		Sobreescritura so = new Sobreescritura(); 
	}
}
