package snippets.ejemplos.juego3EnRaya;

public class Jugada {

	private Valor valor;
	private int nJugador;
	
	public Jugada(Valor valor, int nJugador) {
		this.valor = valor;
		this.nJugador = nJugador;
	}
	
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	public int getnJugador() {
		return nJugador;
	}
	public void setnJugador(int nJugador) {
		this.nJugador = nJugador;
	}
	
	@Override
	public boolean equals(Object obj) {
		Jugada jugada = (Jugada) obj;
		
		if (this.valor != jugada.valor) return false;
		if (this.nJugador != jugada.nJugador) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "PJ: %d - V: %s".formatted(this.nJugador, this.valor);
	}
	
}
