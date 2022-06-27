package test;

public class DudasClasesInstancias {
	
	public static void main(String[] args) {
		
		// 2 Instancias Diferentes con los mismos valores
		Coche coche01 = new Coche("coche 01", COMBUSTIBLE.DIESEL);
		Coche coche02 = new Coche("coche 01", COMBUSTIBLE.DIESEL);
		
		System.out.println(""+coche01.toString());
		System.out.println(""+coche02);
		
		System.out.println("Cosa "+coche01.cosa+" - "+coche01.valor);
		System.out.println("Cosa "+coche02.cosa+" - "+coche02.valor);

		coche02.cosa = 100;
		coche01.valor = 212;
		coche02.valor = 22;
	
		System.out.println("Cosa "+coche01.cosa+" - "+coche01.valor);
		System.out.println("Cosa "+coche02.cosa+" - "+coche02.valor);
		
		boolean sonIguales = coche01.equals(coche02);
		System.out.println("¿Son Iguales? "+sonIguales);
		
	}

}
