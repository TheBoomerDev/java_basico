package snippets.visibilidad;

public class Ejemplos {

	public static void main(String[] args) {
		
		/*
		 * Ejemplos de Visibilidad
		 */
		Visible visible = new Visible(15);
		// Tenemos acceso a esta variable.
		visible.enteroModificable = 0;
		
		// Tenemos acceso, pero no es modificable
		//  visible.enteroNOModificable = 0;
	
		// No es accesible, visible desde fuera de la clase.
		// visible.enteroInvisible = 0;
		
		
		/*
		 * Ejemplos de static
		 */
		
		VariableStatic varStatic1 = new VariableStatic();
		VariableStatic varStatic2 = new VariableStatic();
		
		varStatic1.enteroClase = 15;
		varStatic1.enteroInstancia = 15;
		
		varStatic2.enteroClase = 12;
		varStatic2.enteroInstancia = 10;
		
		System.out.println("Variables Instancia: %d %d".formatted(varStatic1.enteroClase, varStatic2.enteroClase) );
		System.out.println("Variables Clase: %d %d".formatted(varStatic1.enteroInstancia, varStatic2.enteroInstancia) );
	}

}
