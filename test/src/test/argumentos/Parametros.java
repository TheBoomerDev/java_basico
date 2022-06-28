package test.argumentos;

import java.util.ArrayList;
import java.util.List;

public class Parametros {
	
	// MAL - No debemos recibir tantos parametros
	public void func1 (String arg1, String arg2, String arg3, String arg4) {}
	
	// Mejor 
	public void func2 (String[] args) {}
	// Mejor 
	public void func3 (List<String> args) {}
	
	// Mucho Mejor
	public void func4(String ...args) {
		int tamano = args.length;
		String arg01 = args[0];
		
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			// Hagamos lo que queramos
		} 
	}
	
	
	// EJEMPLOS DE LLAMADAS
	public void ejemplos() {
		func1("","","","");
		
		String[] lista = null;
		func2(lista);
		
		List<String> lista2 = new ArrayList<String>();
		func3(lista2);
		
		// Podemos pasar un numero indefinido de parametros
		func4("","","","", "","","","", "","","","", "","","","", "","","","");
	}

}
