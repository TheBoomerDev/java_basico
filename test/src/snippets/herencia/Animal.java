package snippets.herencia;

public class Animal {
	
	private int puntosDeVida = 100;
	
	public boolean estaVivo() {
		return (puntosDeVida > 0);
	}

	public void sacarVida(int vida) {
		if (vida < 0) return;
		
		if (!estaVivo()) return;
		
		this.puntosDeVida = this.puntosDeVida - vida;
		
		if (this.puntosDeVida < 0) this.puntosDeVida = 0;
	}
	
	public void come(int vida) {
		this.puntosDeVida = this.puntosDeVida + vida;
	}
	
}
