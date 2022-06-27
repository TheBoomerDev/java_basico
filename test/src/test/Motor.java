package test;

public class Motor {

	int cilindrada = 0;
	int caballos = 100;
	
	/**
	 * 0 - gasolina, 1 - diesel, 2 - electrico, 3 - hibrido
	 */
	COMBUSTIBLE combustible;
	
	public Motor(COMBUSTIBLE combustible) {
		this.combustible = combustible;
	}
	
	@Override
	public String toString() {
		return "CC:"+this.cilindrada+" - W:"+this.caballos+" - "+this.combustible;
	}
	
	@Override
	public boolean equals(Object obj) {
		Motor motor2 = (Motor) obj;
		
		if (this.caballos != motor2.caballos) return false;
		
		if (this.cilindrada != motor2.cilindrada) return false;
		
		if (!this.combustible.equals(motor2.combustible)) return false;
		
		return true;
	}
	
}
