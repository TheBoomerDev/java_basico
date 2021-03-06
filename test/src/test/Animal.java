package test;

public class Animal {
	
	/*
	 * Una variable Boolean (true/false) para saber si el animal est? vivo.
	 * Solo es accesible desde dentro de la instancia de la clase.
	 */
	private boolean estaVivo = true;
	
	/*
	 * Variable entera para la salud del animal. 
	 * Solo es accesible desde dentro de la instancia de la clase.
	 */
	private int puntosDeVida = 100;
	
	/*
	 * CONSTANTE con el nombre de la especie.
	 * Tiene valor cuando se incializa, y NO se puede cambiar. 
	 * Una vez tiene valor, no se puede cambiar (final)
	 */
	public final String nombreEspecie;
	
	/**
	 * <strong>Constructor</strong> de la clase. 
	 * Una vez tenemos 1 constructor definido, no podemos usar otro. 
	 * 
	 * @param nombre - Nombre de la especie, <strong>No es modificable</strong>
	 */
	public Animal(String nombre) {
		this.nombreEspecie = nombre;
	}

	/**
	 * Restar la vida <i>(hacer da?o)</i> al animal. 
	 * 
	 * En caso de que los puntos de vida lleguen a 0, <i>"Matamos al animal"</i>
	 *  
	 * @param valor Numero de puntos de vida que restamos al animal
	 */
	public void restarVida (int valor) {
		
		// En caso que ya est? muerto, no quitamos puntos de vida. Salimos de la funci?n
		if (!this.estaVivo) {
			return;
		} 
		
		if (valor < 0) {
			valor = -1 * valor;
		}
		
		// Quitamos la vida
		this.puntosDeVida = this.puntosDeVida - valor;
		
		// Comprobamos si est? muerto
		if (this.puntosDeVida <= 0) {
			this.estaVivo = false;
		}
		
	}
}
