package test.transformar;

public class TransString {

	public static void main(java.lang.String[] args) {

		int entero =  5;
		long largo = 5;
		float decimal = 3.14f;
		double decimalLargo = 3.14f;
		
		boolean existe = true;
		
		// Transformar a String
		String strEntero = ""+entero;
		strEntero = String.valueOf(entero);
		
		String strBoolean = String.valueOf(existe);
		strBoolean = ""+existe;
		
		
		/*
		 * Clases De Java
		 */
		
		Integer jInt = 5;
		Long jLong = (long) 5;
		Float jFloat = 3.14f;
		Double jDouble = (double)3.14f;
		
		
		String jStrInt = jInt.toString();
		String jStrLong = jLong.toString();
		String jStrFloat = jFloat.toString();
		String jStrDouble = jDouble.toString();
		
		jStrInt = String.valueOf(jInt);
		jStrLong = String.valueOf(jLong);
		jStrFloat = String.valueOf(jFloat);
		jStrDouble = String.valueOf(jDouble); 
		

	}

}
