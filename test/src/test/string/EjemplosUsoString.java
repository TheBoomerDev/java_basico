package test.string;

public class EjemplosUsoString {

	public static void main(String[] args) {
		String cad1 = "hola";
		
		// Nos devuelve la letra de la posición que le pasemos (o)
		char ch1 = cad1.charAt(1);
		
		// Nos devuelve la "suma" de los strings: hola Mundo
		String cad2 = " Mundo";
		// hola Mundo
		String resultado = cad1.concat(cad2);
		resultado = cad1 + cad2;
		System.out.println(resultado);
		
		// CURIOSIDAD: OJO con usarlo (o como usarlo)
		resultado = cad1 + 12; // "hola 12"
		System.out.println(resultado);
		resultado = 12 + cad1;
		System.out.println(resultado);
		resultado = ""+12;
		resultado = ""+'a';
		
		// Transformar en String
		resultado = String.valueOf(12);
		resultado = String.valueOf(true);
		resultado = String.valueOf(12.4f);
		resultado = String.valueOf(cad1);
		resultado = String.valueOf('a');
		
		// Comprobar si lo contiene
		boolean contiene = cad1.contains("ol"); // true
		        contiene = cad1.contains("lo"); // false
		        contiene = cad1.contains("a");
		
		        
		// Comparación Strings
		boolean esIgual = cad1.equals("hola"); // true
		        esIgual = cad1.equals("Hola"); // false
		
		cad2 = "hola";
		boolean noSonIguales = (cad1 == cad2); // false
		System.out.println(noSonIguales);
		
		System.out.println( (Object) cad1);
		System.out.println( (Object) cad2);		
		        
		
		// Formateo
		
		String formato = "%s-%c%c%c%c%c%d Vaya Por Dios";
		String formateado = String.format(formato, cad2, ch1, ch1, ch1, ch1, ch1,12);
		System.out.println(formateado);
		        
	}
}
