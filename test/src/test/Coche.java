package test;

public class Coche implements Comparable<Coche> {

	// Atributo Static - Atributo de Clase
	public static final float pi = 3.14f; // No puede variar, se puede acceder desde fuera, y es atributo de clase
	public static int cosa = 0;
	public int valor = 0;
	
	public static int getCosa() {
		return Coche.cosa;
	}
	
	/*
	 * CONSTANTE con la marca del coche.
	 * Tiene valor cuando se incializa, y NO se puede cambiar. 
	 * Una vez tiene valor, no se puede cambiar (final)
	 */
	private final String marca;
	
	/*
	 * Numero de puertas de nuestro. Valor por defecto <i>(Si no decimos nada)</i> es 3
	 * Solo es accesible desde dentro de la instancia de la clase.
	 */
	private int puertas = 3;
	
	/*
	 * Variable de tipo motor; que se crea en el constructor.
	 */
	private Motor motor;

	/**
	 * 
	 * @param marca <= Inicializamos la constante de la marca del coche
	 */
	public Coche(String marca, COMBUSTIBLE combustible) {
		this.marca = marca;
		this.motor = new Motor(combustible);
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getRuedas() {
		return this.puertas;
	}
	
	public Motor getMotor() {
		return this.motor;
	}

	@Override
	public int compareTo(Coche o) {
		String marca = o.marca;
		if (marca.equals(this.marca)) return 0;
		
		if (marca.length() > this.marca.length()) return 1;
		
		return -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Coche coche2 = (Coche) obj;
		if (!this.marca.equals(coche2.marca)) return false;
		
		if (this.puertas != coche2.puertas) return false;
		
		if (!this.motor.equals(coche2.motor)) return false;
		
		return true;		
	}
	
	@Override
	public String toString() {
		return "Marca: "+this.marca+ " - Puertas:"+this.puertas+" - Motor:"+this.motor.toString();
	}
	
}
