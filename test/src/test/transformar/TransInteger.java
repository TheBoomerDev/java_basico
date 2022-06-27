package test.transformar;

public class TransInteger {

	public static void main(String[] args) {

		int entero =  5;
		long largo = 5;
		float decimal = 3.14f;
		double decimalLargo = 3.14f; 
		
		Integer jInt = Integer.valueOf(entero); 
		String jStr = String.valueOf(largo);
		
		try {
			jInt = Integer.valueOf(jStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		jStr = String.valueOf(decimal);
		try {
			jInt = Integer.valueOf(jStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		jStr = String.valueOf(decimalLargo);
		try {
			jInt = Integer.valueOf(jStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} 
		
		jStr = String.valueOf(entero);
		try {
			jInt = Integer.valueOf(jStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		System.out.println("TERMINO");
	}

}
