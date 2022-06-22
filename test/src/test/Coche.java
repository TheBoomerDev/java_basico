package test;

public class Coche {
	
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
	public Coche(String marca) {
		this.marca = marca;
		this.motor = new Motor();
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
}
