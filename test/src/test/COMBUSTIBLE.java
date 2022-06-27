package test;

public enum COMBUSTIBLE {
	
	/**
	 * 0 - gasolina, 1 - diesel, 2 - electrico, 3 - hibrido
	 */
	
	GASOLINA(0),
	DIESEL(1),
	ELECTRICO(2),
	HIBRIDO(3);
	
	private final int value;
	
	private COMBUSTIBLE(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	

}
