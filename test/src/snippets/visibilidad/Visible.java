package snippets.visibilidad;

public class Visible {
	
	/**
	 * Visible Siempre desde fuera de esta clase. 
	 * Pero dentro de este tipo
	 */
	public int enteroModificable = 0;
	
	/**
	 * Visibile igual que enteroModificable.
	 * Una vez tiene valor, ya no se puede modificar.
	 */
	public final int enteroNOModificable = 0;
	
	/**
	 * Solo es accesible desde dentro de la clase
	 */
	private int enteroInvisible = 0;
	
	
	public Visible(int entero) {
		this.enteroInvisible = entero;
	}

}
