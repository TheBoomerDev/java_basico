package snippets.visibilidad;

public class Visible {
	// https://www.gotoquiz.com/web-coding/wp-content/uploads/2011/03/java-member-access-levels1.png
	
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

	/**
	 * Es 'Public' para todas las clases del mismo paquete y las subClases
	 */
	protected int enteroProtegido = 0;
	
	/**
	 * Es 'Public' para las clases en el mismo paquete/directorio
	 */
	int enteroPackage = 0;
	
	
	public Visible(int entero) {
		this.enteroInvisible = entero;
	}

}
